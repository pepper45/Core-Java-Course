package com.demo.basics;

//Default package, always imported
import java.lang.*;

//Public access modifier, available everywhere
public class BasicClass {

    //Static keyword, belongs to the class
    static Object obj = new Object();

    //Object reference, references are memory address
    static Class classObj;

    static Integer intObj = new Integer(6);

    private Object field1;

    //User defined class
    static Dog dog = new Dog();

    public static void main(String[] args) {
        System.out.println(obj);
        System.out.println(classObj);
        System.out.println(intObj);
    }
}
