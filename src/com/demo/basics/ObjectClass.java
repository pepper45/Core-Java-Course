package com.demo.basics;

public class ObjectClass {
    public static void main(String[] args) {

        //Object referece
        Dog dog =
                //Actual Object constructed using overloaded constructor
                new Dog("Labrador", 2, "Bob", "Pepper");

        //Default Constructor
        Dog dog1 = new Dog();
        //Setter Methods, Acting on Object Fields
        dog1.setBreed("Golden Retriever");
        dog1.setAge(3);
        dog1.setName("Tommy");
        dog1.setOwner("Suraj");

        Dog dog2 = new Dog();

        //Printing Hashcode or memory address of the objects
        System.out.println(dog);
        System.out.println(dog1);
        System.out.println(dog2);

        //callMethods(dog, dog1);
    }

    static void callMethods(Dog dog, Dog dog1){
        System.out.println(dog1 + " : " + dog1.bark());
        System.out.println(dog1 + " : " + dog1.wagTail());
        System.out.println(dog1 + " : " + dog1.celebrateBirthday());
        System.out.println(dog + " : " + dog.adoptDog("Neha"));
    }
}


class Dog {

    //Fields
    private String breed;
    private int age;
    private String name;
    private String owner;

    //Default Constructor
    public Dog() {
    }

    //Parameterized or Overloaded Constructor
    public Dog(String breed, int age, String name, String owner) {
        this.breed = breed;
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    //Methods
    public String bark(){
        return "Woof Woof!";
    }

    public String wagTail(){
        return "Wagging tail!";
    }

    public int celebrateBirthday(){
        return this.age + 1;
    }

    public String adoptDog(String owner){
        this.setOwner(owner);
        return this.getOwner();
    }

    //Setters and Getters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "breed='" + breed + '\'' +
//                ", age=" + age +
//                ", name='" + name + '\'' +
//                ", owner='" + owner + '\'' +
//                '}';
//    }
//
//        @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Dog dog = (Dog) o;
//        return age == dog.age && Objects.equals(breed, dog.breed) && Objects.equals(name, dog.name) && Objects.equals(owner, dog.owner);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(breed, age, name, owner);
//    }
}
