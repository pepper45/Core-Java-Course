package com.demo.oops;

import java.util.Objects;

public abstract class Animal {

    protected String category;
    protected String name;
    protected int age;
    protected String sound;
    protected double height;
    protected double weight;
    protected FlyInterface flyStrategy;

    public abstract String makeSound();
    public abstract String move();
    public abstract String fly();

    public Animal(){}

    public Animal(String category, String name, int age, String sound, double height, double weight) {
        this.category = category;
        this.name = name;
        this.age = age;
        this.sound = sound;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "category='" + category + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sound='" + sound + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(animal.height, height) == 0 && Double.compare(animal.weight, weight) == 0 && Objects.equals(category, animal.category) && Objects.equals(name, animal.name) && Objects.equals(sound, animal.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, age, sound, height, weight);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
