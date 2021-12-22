package com.demo.oops;

import java.util.function.IntFunction;

public class Application {
    public static void main(String[] args) throws Exception {
        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo("Nandankanan",2, 3000.5, "Bhubaneswar");

        Ticket ticket1 = new Ticket();
        zoo1.addTickets(ticket1);
        zoo2.addTickets(ticket1);
        System.out.println(zoo2.getTickets()[0] + " : " + ticket1);
        System.out.println(zoo2.getTickets()[1]);
        System.out.println(zoo2.getTickets()[2]);
        Ticket ticket2 = new Ticket();
        zoo2.addTickets(ticket2);
        zoo2.addTickets(ticket2);
        //zoo2.addTickets(ticket2);
        System.out.println(zoo2.getTickets()[1]);
        System.out.println(zoo2.getTickets()[2]);

        //System.out.println(5/0);

        System.out.println(zoo2.visit("Vivek"));
        System.out.println(zoo2.visit("Nihar"));
        //System.out.println(zoo2.visit("Pradipta"));


//        Animal animal1 = new Lion("Mammal", "Simba", 5, "Roar!", 5.6, 70.8);
//        zoo2.addAnimal(animal1);
//        Animal animal2 = new Duck("Bird", "Daffy", 3, "Quack!", 2.5, 40.8);
//        zoo2.addAnimal(animal2);
//
//        System.out.println(animal1.makeSound());
//        System.out.println(animal2.makeSound());
//        System.out.println(animal1.move());
//        System.out.println(animal2.move());
//        System.out.println(animal1.fly());
//        System.out.println(animal2.fly());
//
//        for (int index=0;index<zoo2.getAnimals().length;index++){
//            Animal obj =  zoo2.getAnimals()[index];
//            if(obj!=null) {
//                System.out.println(obj);
//            }
//        }
//
//        System.out.println(zoo2.getCurrentVisitors());
//        int newCurrentVisitors =  zoo2.visit("Vivek");
//        System.out.println(newCurrentVisitors);
//
//        System.out.println(zoo2.getVisitors()[0]);
//        System.out.println(zoo2.getVisitors()[1]);
    }
}
