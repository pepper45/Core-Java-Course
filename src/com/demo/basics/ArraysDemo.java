package com.demo.basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int index = 0 ; index < arr.length; index++){
            System.out.println(arr[index]);
            arr[index] = index + 11;
        }
        for (int index = 0 ; index < arr.length; index++){
            System.out.println(arr[index]);
        }


        Double arr1[] = new Double[5];
        Object arr2[] = new Object[5];

        Arrays.fill(arr1, 7.8);
        System.out.println("Filling values");
        for (Double aDouble : arr1) {
            System.out.println(aDouble);
        }

        System.out.println("Randomizing values");
        for (int index=0;index<arr1.length;index++) {
            Double val = arr1[index];
            arr1[index] = val + (Math.random()*50);
            System.out.println(arr1[index]);
        }

        Arrays.sort(arr1);
        System.out.println("Sorting in Ascending order");
        for (Double aDouble : arr1) {
            System.out.println(aDouble);
        }

        Arrays.sort(arr1, Comparator.reverseOrder());
        System.out.println("Sorting in Descending order");
        for (Double aDouble : arr1) {
            System.out.println(aDouble);
        }

        arr2 = Arrays.copyOf(arr1,arr1.length-2);
        System.out.println("Copying values");
        for (Object o : arr2) {
            System.out.println(o);
            System.out.println(((Double) o).intValue());
        }
    }

}
