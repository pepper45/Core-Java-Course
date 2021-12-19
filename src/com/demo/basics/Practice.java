package com.demo.basics;

public class Practice {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Object ob1 = new Object();
        System.out.println(ob1);

        Dog dog1 = new Dog();
        System.out.println(dog1);

        Dog dog2 = new Dog("Labrador",5,"Tommy","Vivek");
        System.out.println(dog2);

        Dog dog3 = new Dog("Labrador",5,"Tommy","Vivek");
        System.out.println(dog3);

        Dog dog4 = dog3;

        System.out.println(dog4.equals(dog3));

        System.out.println(dog2.hashCode());
        System.out.println(dog1.equals(dog2));
        System.out.println(dog2.equals(dog3));


    }
}

class Labrador extends Dog{
    private String name;
}