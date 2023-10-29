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
        Pet pet = context.getBean("myPet",Pet.class);
//        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();

        context.close();
    }
}
