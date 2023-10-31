import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntroduction.Dog;
import springIntroduction.Pet;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Pet dog1 = context.getBean("dog", Dog.class);
        dog1.say();
//        Pet dog2 = context.getBean("dog", Dog.class);
//
//        System.out.println("Перемеменные ссылаются на один и тот же объект ?");
//        System.out.println(dog1==dog2);
//        System.out.println(dog1.equals(dog2));
//        System.out.println(dog1);
//        System.out.println(dog2);

        context.close();
    }
}
