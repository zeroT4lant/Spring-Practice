import springIntroduction.Cat;
import springIntroduction.Dog;
import springIntroduction.Pet;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();
        Pet pet2 = new Cat();
        pet.say();
        pet2.say();
    }
}
