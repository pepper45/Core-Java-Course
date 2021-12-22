package com.demo.java8;

import com.demo.oops.Lion;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {


        int arr[] = new int[]{4,8,9,13,16};
        int input = 9;

        for(int value : arr){
            if(value==input){
                System.out.println("Value found!");
            }
        }

        List<Integer> list = new ArrayList<>(10);

        list.add(4);
        list.add(8);
        list.add(90);
        list.add(9);
        list.add(16);

        System.out.println(list.contains(90));
        System.out.println(list.remove(2));

    }
}
