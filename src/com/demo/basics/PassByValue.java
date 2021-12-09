package com.demo.basics;

public class PassByValue {
    public static void main(String[] args) {

        //Primitive variables
        int a = 15;
        int b = 25;

        //Object variables/references
        Number a1 = new Number(4); // a1 value mem address
        Number b1 = new Number(6);

        //Pass by value
        System.out.println("Sum : " + add(a, b));
        a=100;
        System.out.println("Value of a is : " + a);

        //Pass by value for Object references
        System.out.println("Sum : " + add(a1, b1));
        System.out.println(b1); // b1 --> object(6);
        System.out.println("B1 after change is : " + b1 + " : " + b1.getValue());
        System.out.println("A1 after change is : " + a1 + " : " + a1.getValue());
        a1.setValue(999);
        System.out.println(a1.getValue());
        a1 = new Number(2000);
        System.out.println(a1.getValue());
        //a1 ---> object(4) ; a1 ----> object(50);

        //local a1 -----> object(4) set value --> object(50)
    }

    private static int add(int a, int b) {
        System.out.println("Sum inside add : " + (a + b));
        //Reassigning a
        a = 5;
        System.out.println("Local variable : " + a);
        return a + b;
    }

    private static int add(Number a1, Number b1) {
        System.out.println("Sum inside add : " + (a1.getValue() + b1.getValue()));
        //Reassigning a1
        a1.setValue(50); // a1 field = 50
        b1.setValue(200);
        b1.setValue(300);
        b1.setValue(500);
        System.out.println("Old B1 : " + b1);
        //Assigning new Object to b1
        b1 = new Number(60); // mem adress different ---> object(60);
        System.out.println(a1);
        System.out.println("New B1 : " + b1 + " : " + b1.getValue()); // local b1 --> object(60);
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
