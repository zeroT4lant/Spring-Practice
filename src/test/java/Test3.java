import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntroduction.Dog;
import springIntroduction.Person;
import springIntroduction.Pet;

public class Test3 {
    public static void main(String[] args) {
        //Dependency Injection - добавление/внедрение зависимостей,
        // делает объекты слабо зависимыми друг от друга
        //Способы внедрения зависимостей:
        //1) С помощью конструкторов
        //2) С помощью сеттеров
        //3) AutoWiring

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        //Pet pet = context.getBean("myPet",Pet.class);
//        Pet pet = new Dog();

        //1)Конструктор
        //(передаём бин Dog'a в конструктор Person'a при помощи метода <constuctor-arg ref="myPet"/>)
        //"myPet"-Id бина собаки передаётся в конструктор
        //------
        //внутри контейнера хранится бин объекта Person, зависящего от класса Pet
        //с внедрением зависимостей, теперь Pet автоматически передаётся в аргумент Person'a
        //и больше нет надобности создавать объект животного, для создания Person
        //следовательно можем получить его из контейнера и сразу вызывать его методы

        //2)Сеттер
        //(создание происходит с тегом <property name="pet" ref="myPet"/> в appContext)
        //поиск метода происходит при помощи name pet->setPet, поле name ищет метод setPet у Person'a
        //ref - указывает на объект, который передадим в аргумент метода setPet
        //-------
        //Создаётся объект Dog bean
        //Создаётся Person bean
        //В аргумент сеттера идёт созданный бин Собаки
        //Вызываются методы

        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        //за кулисами
        //Person myPerson = new Person();
        //подстановка аргументов из myApp.properties
        //myPerson.setSurname("Gribov"); дефолт значение (аргумент приходит из поля value)
        //myPerson.setAge(19); дефолт значение (аргумент приходит из поля value)
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close();
    }
}
