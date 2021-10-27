package com.demo;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        for (int index = 0; index < args.length; index++) {
            System.out.println(args[index]);
        }
        System.out.println("Done!!!");
    }
}
