package com.demo.basics;

import java.time.LocalDate;
import java.util.*;

public class DataTypes {

    //Primitives
    static int i1;
    static int i2 = 5;
    static long l1 = 60L;
    static float f1 = 6.7F;
    static double d1;
    static double d2 = 9.8D;
    static double d3 = 10D;
    static boolean b1;
    static boolean b2 = true;
    static char c1;
    static char c2 = 'G';
    static char c3 = 100;

    public static void main(String[] args) {
        System.out.println(i1 + " : " + i2 + " : " + d1 + " : " + f1 + " : " + b1 + " : " + c1 + " : " + c2 + " : " + c3);
        //wrapper();
        //autoboxing();
        //unboxing();
        //typecasting();
    }

    //Wrapper Classes
    static Integer wi1;
    static Integer wi2 = new Integer(12);
    static Integer wi3 = 60;
    static Double wd1;
    static Double wd2 = 5.6;
    static Boolean wb1;
    static Boolean wb2 = true;


    public static void wrapper(){
        System.out.println("Wrapper classes");
        System.out.println(wi1 + " : " + wi2 + " : " + wi3 + " : " + wd1 + " : " + wd2 + " : " + wb1 + " : " + wb2);
    }

    //Autoboxing
    static Integer ab1 = 63;
    static Double ab2 = 7.9;
    static Character ab3 = 'M';

    public static void autoboxing(){
        System.out.println("Autoboxing");
        System.out.println(ab1 + " : " + ab2 + " : " + ab3);
    }

    //Unboxing
    public static void unboxing(){
        System.out.println("Unboxing");
        System.out.println(ab1 + 5);
        System.out.println(ab2 + 75.3);
        System.out.println("A"+ab3);
    }

    //Typecasting
    //Explicit
    static int t1 = (int)5.6;
    static long t2 = 66;
    static int t3 = (int) (5.7 + 8.9);
    //Implicit
    static double t4 = 7 + 45;
    static char t5 = 101;
    static int t6 = 'F';
    static long t7 = 133;

    public static void typecasting(){
        System.out.println("Typecasting");
        System.out.println(t1 + " : " + t2 + " : " + t3 + " : " + t4 + " : " + t5 + " : " + t6 + " : " + t7);
    }
}
