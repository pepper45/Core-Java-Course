package com.demo.io;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        //Try with resources
        try(Scanner sc = new Scanner(System.in)){ //Scanner takes an inputstream object
            String scannerInput = sc.nextLine();
            Integer hh = sc.nextInt();
            System.out.println(scannerInput + " : " + hh);
            //Keep on reading input
            while (sc.hasNext()){
                Double input = sc.nextDouble();
                if(input.equals(5.0)) {
                    System.exit(0);
                }
                System.out.println(input);
            }
        }
        catch (Exception e){
            System.out.println("In Exception " + e.getMessage());
            e.printStackTrace();
        }
    }
}
