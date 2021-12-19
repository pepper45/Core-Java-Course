package com.demo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedRWDemo {
    public static void main(String[] args) {
        //readData();
        writeData();
    }

    private static void readData(){
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String l = reader.readLine();
            System.out.println(l);
            //Keep on reading input
            reader.lines().forEach( line -> {
                if(line.equalsIgnoreCase("end")){
                    System.exit(0);
                }
                System.out.println(line);});
        }
        catch (Exception e){
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }

    private static void writeData(){
        try(BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) { //OutputStreamWriter takes OutputStream object as parameter
            String data = "Writing to console";
            writer.write(data);
        }
        catch (Exception e){
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }
}
