package com.demo.oops;

import java.io.IOException;

public class Zoo {
    protected String name;
    protected int capacity;
    protected double area;
    protected String location;
    protected int currentVisitors;
    protected Ticket[] tickets;
    protected Animal[] animals;
    protected String[] visitors;

    public Zoo(){}

    public Zoo(String name, int capacity, double area, String location) {
        this.name = name;
        this.capacity = capacity;
        this.area = area;
        this.location = location;
        this.tickets = new Ticket[3];
        this.animals = new Animal[100];
        this.visitors = new String[this.capacity];
    }

    public void addTickets(Ticket ticket) {
        try {
            System.out.println(tickets[3]);
            if (tickets[tickets.length - 1] != null) {
                throw new RuntimeException("Tickets array is full!");
            }
            for (int i = 0; i < tickets.length; i++) {
                System.out.println("Current i : " + i);
                if (tickets[i] == null) {
                    tickets[i] = ticket;
                    break;
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(" Tickets array is null");
        }
    }

    public void addAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i]==null){
                animals[i] = animal;
                break;
            }
        }
    }

    public int visit(String visitorName) throws Exception {
        if(visitors[visitors.length-1]!=null){
            throw new Exception("Zoo is at max capacity!");
        }
        this.currentVisitors++;
        for(int i=0;i<visitors.length;i++){
            if(visitors[i]==null){
                visitors[i] = visitorName;
                break;
            }
        }
        return this.currentVisitors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCurrentVisitors() {
        return currentVisitors;
    }

    public void setCurrentVisitors(int currentVisitors) {
        this.currentVisitors = currentVisitors;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(Ticket[] tickets) {
        this.tickets = tickets;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String[] getVisitors() {
        return visitors;
    }

    public void setVisitors(String[] visitors) {
        this.visitors = visitors;
    }
}
