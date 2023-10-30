package springIntroduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet){
//        System.out.println("Person bean created");
//        this.pet = pet;
//    }

    public Person(){
        System.out.println("Person bean created");
    }

    //pet -> setPet
    public void setPet(Pet pet) {
        System.out.println("Class Person : set Pet");
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet!");
        pet.say();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
