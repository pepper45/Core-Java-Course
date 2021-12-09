package com.demo.basics;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;

public class StringsDemo {

    public static void main(String[] args) {
        String str1 = "String1";
        String str2 = "String2";
        System.out.println("Comparing references str 1 and 2 : " + (str1 == str2));

        String str3 = "String1";
        System.out.println("Comparing references str 1 and 3 : " + (str1 == str3));
        System.out.println("Comparing strings str 1 and 3 using equals : " + (str1.equals(str3)));
        System.out.println("Comparing strings str 1 and 3 using compare to : " + (str1.compareTo(str3)));

        String str4 = new String("String1");
        System.out.println("Comparing references str 1 and 4 : " + (str1 == str4));
        System.out.println("Comparing strings str 1 and 4 using equals : " + (str1.equals(str4)));
        System.out.println("Comparing strings str 1 and 4 using compare to : " + (str1.compareTo(str4)));

        String str5 = new String("String1");
        System.out.println("Comparing references str 4 and 5 : " + (str4 == str5));

        String str6 = str5;
        System.out.println("Comparing references str 5 and 6 : " + (str5 == str6));

        String tom = "Tom";
        String jerry = "Jerry";
        System.out.println(String.format("Hello %s and %s", tom, jerry));

        stringConcatenation();
        stringBuilder();
    }

    public static void stringConcatenation() {
        String s1 = "0 1 ";
        int lastNum = 1;
        int prevNum = 0;
        Instant start1 = Instant.now();
        for (int index = 0; index < 60000; index++) {
            int nextNum = prevNum + lastNum;
            s1 = s1 + nextNum + " ";
            prevNum = lastNum;
            lastNum = nextNum;
        }
        Instant finish1 = Instant.now();
        long timeElapsed = Duration.between(start1, finish1).getSeconds();
        System.out.println("Time taken in concat : " + timeElapsed + " seconds");
    }

    public static void stringBuilder(){
        StringBuilder sb1 = new StringBuilder("0 1 ");
        int lastNum = 1;
        int prevNum = 0;
        Instant start1 = Instant.now();
        for (int index = 0; index < 100000; index++) {
            int nextNum = prevNum + lastNum;
            sb1.append(nextNum);
            sb1.append(" ");
            prevNum = lastNum;
            lastNum = nextNum;
        }
        Instant finish1 = Instant.now();
        long timeElapsed = Duration.between(start1, finish1).getSeconds();
        System.out.println("Time taken in builder : " + timeElapsed + " seconds");
    }


}
