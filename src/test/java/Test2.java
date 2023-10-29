import org.springframework.context.support.ClassPathXmlApplicationContext;
import springIntroduction.Pet;

public class Test2 {
    public static void main(String[] args) {
        //Inversion of Control -процесс/принцип, когда передаём права на контроль
        // над объектами спрингу


        //бины - объекты, создаваемые и управляемые спринг контейнером

        //спринг контейнер, в нём все объекты, из него получаем бины
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //имя(id) myPet соответствует классу Dog из applicationContext
        //myPet ссылается пока что на класс Dog
        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        //не забываем закрывать контекст
        context.close();
    }
}
