import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntroduction.Dog;

public class Test4 {
    public static void main(String[] args) {
        //Scope: singleTone - stateless, дефолтный scope
        //сразу создаёт бин при чтении конфиг файла SpringContainer'ом , у одного класса может быть один экземпляр
        //бин является общим для всех, кто запросит его у SC'a

        //Scope: prototype - stateful создаёт бин только при обращении к SpingContainer'у
        // с помощью метода getBean(инициализации)
        //для каждого обращения создаётся новый бин в SpingContainer'e
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.setName("Belka");
        Dog yourDog = context.getBean("myPet", Dog.class);
        yourDog.setName("Strelka");

        System.out.println(dog.getName());
        System.out.println(yourDog.getName());

        //переменные ссылаются на один и тот же объект ?
        System.out.println("переменные ссылаются на один и тот же объект ?");
        System.out.println(dog.equals(yourDog));
        System.out.println(dog==yourDog);

        context.close();
    }
}
