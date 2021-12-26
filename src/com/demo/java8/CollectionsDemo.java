package com.demo.java8;

import com.demo.oops.Lion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsDemo {

    static Optional<List<Integer>> list1;

    private int add(int a) {
        return a + 10;
    }

    public static void main(String[] args) {


        int arr[] = new int[]{4, 8, 9, 13, 16};
        int input = 9;

        for (int value : arr) {
            if (value == input) {
                System.out.println("Value found!");
            }
        }

        List<Integer> list = new ArrayList<>(10);

        list.add(4);
        list.add(8);
        list.add(90);
        list.add(9);
        list.add(16);
        list.add(16);

        List<Integer> newList = list.stream()
                .map((val) -> val + 50)
                .filter( (val) -> val%2!=0)
                .collect(Collectors.toList());

        newList.forEach(val -> System.out.println(val));

        Function<Integer, Integer> fun = (a) -> a + 10;
        System.out.println(fun.apply(5));


//        System.out.println(list.contains(90));
//        System.out.println(list.remove(2));
//        System.out.println(list.get(3) + ":" + list.get(4));
//
//        Set<Integer> set = new HashSet<>();
//        set.add(4);
//        set.add(5);
//        set.add(4);
//
//        Object[] values = set.toArray();
//
//        for(Object value : values){
//            System.out.println(value);
//        }
//
//        Set<Integer> orderedSet = new TreeSet<>(Comparator.reverseOrder());
//        orderedSet.add(4);
//        orderedSet.add(8);
//        orderedSet.add(90);
//        orderedSet.add(9);
//        orderedSet.add(16);
//        orderedSet.add(16);
//
//        for (Object value : orderedSet.toArray()){
//            System.out.println(value);
//        }
//
//        Map<String,Integer> map = new TreeMap<>();
//        map.put("Vivek",10);
//        map.put("Pradipta",20);
//        map.put("Nihar",30);
//        map.put("Vivek",50);
//        map.put("Nihar1",50);
//        map.put("Vivek1",70);
//
//        for( Object val :   map.entrySet().toArray()){
//            System.out.println(val);
//        }
//
//        map.remove("Vivek");
//
//        System.out.println(map.containsKey("Vivek"));
//
//        System.out.println(map.get("Vivek"));


    }
}
