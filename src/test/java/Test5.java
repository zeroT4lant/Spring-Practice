import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntroduction.Dog;

public class Test5 {

    public static void main(String[] args) {
        //если у бина scope = prototype, то
        //init метод для каждого новосозданного типа
        //дестрой вызываться не будет
        //программисту необходимо самому закрывать, освобождать ресурсы,
       //используемые в бине
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog doggo = context.getBean("myPet", Dog.class);

        doggo.say();

        context.close();
    }
}
