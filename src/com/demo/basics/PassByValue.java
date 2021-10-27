package com.demo.basics;

public class PassByValue {
    public static void main(String[] args) {

        //Primitive variables
        int a = 15;
        int b = 25;

        //Object variables/references
        Number a1 = new Number(4);
        Number b1 = new Number(6);

        //Pass by value
        System.out.println("Sum : " + add(a, b));
        System.out.println("Value of a is : " + a);

        //Pass by value for Object references
        System.out.println("Sum : " + add(a1, b1));
        System.out.println(b1);
        System.out.println("B1 after change is : " + b1 + " : " + b1.getValue());
        System.out.println("A1 after change is : " + a1 + " : " + a1.getValue());
    }

    private static int add(int a, int b) {
        System.out.println("Sum inside add : " + (a + b));
        //Reassigning a
        a = 5;
        return a + b;
    }

    private static int add(Number a1, Number b1) {
        System.out.println("Sum inside add : " + (a1.getValue() + b1.getValue()));
        //Reassigning a1
        a1.setValue(50);
        System.out.println("Old B1 : " + b1);
        //Assigning new Object to b1
        b1 = new Number(60);
        System.out.println(a1);
        System.out.println("New B1 : " + b1 + " : " + b1.getValue());
        return a1.getValue() + b1.getValue();
    }
}

class Number {

    private Integer value;

    public Number() {
    }

    public Number(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
