import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import springIntroduction.MyConfig;
import springIntroduction.Person;
import springIntroduction.Pet;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1  = context.getBean("catBean",Pet.class);
//        Pet cat2  = context.getBean("catBean",Pet.class);
//        System.out.println(cat1);
//        System.out.println(cat2);
//        cat1.say();
//        cat2.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        person.callYourPet();

        context.close();
    }
}
