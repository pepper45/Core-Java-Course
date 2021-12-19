package com.demo.oops;

public class Lion extends Animal{

    public Lion() {
    }

    public Lion(String category, String name, int age, String sound, double height, double weight) {
        super(category, name, age, sound, height, weight);
    }

    @Override
    public String makeSound() {
        return sound;
    }

    @Override
    public String move() {
        return "Walk";
    }

    @Override
    public String fly() {
        return new FlyInterface() {
            @Override
            public String fly() {
                return "I cannot fly!";
            }
        }.fly();
    }


}
