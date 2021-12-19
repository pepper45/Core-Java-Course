package com.demo.oops;

public class Duck extends Animal{

    public Duck() {
    }

    public Duck(String category, String name, int age, String sound, double height, double weight) {
        super(category, name, age, sound, height, weight);
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String move() {
        return "Swim";
    }

    @Override
    public String fly() {
        return new FlyInterface() {
            @Override
            public String fly() {
                return "I am flying!";
            }
        }.fly();
    }
}
