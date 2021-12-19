package com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.CharBuffer;
import java.nio.file.Files;

public class FileRWDemo {
    public static void main(String[] args) {
        //readFile();
        readFileWithBufferedReader();
        //writeFile();
    }

    private static void readFile() {
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
        try (FileReader fr = new FileReader("resources/input.txt")) {
            int data;
            while (( data = fr.read()) != -1)
                System.out.print((char)data);
        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }

    private static void readFileWithBufferedReader(){
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
        try (BufferedReader br = new BufferedReader(
                new FileReader("D:/Projects/Core-Java-Course/input1.txt"))) {

            String inputLine = "";
            while ( (inputLine = br.readLine())!=null ){
                System.out.println(inputLine + "ABC");
            }

        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }
}
