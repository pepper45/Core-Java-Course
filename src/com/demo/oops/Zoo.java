package com.demo.oops;

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

    public void addTickets(Ticket ticket){
        for(int i=0;i<tickets.length;i++){
            if(tickets[i]==null){
                tickets[i] = ticket;
            }
        }
    }

    public void addAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i]==null){
                animals[i] = animal;
            }
        }
    }

    public int visit(String visitorName){
        this.currentVisitors++;
        for(int i=0;i<visitors.length;i++){
            if(visitors[i]==null){
                visitors[i] = visitorName;
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
