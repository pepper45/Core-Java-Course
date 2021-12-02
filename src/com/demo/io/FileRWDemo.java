package com.demo.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.CharBuffer;
import java.nio.file.Files;

public class FileRWDemo {
    public static void main(String[] args) {
        readFile();
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
        try (BufferedReader br = new BufferedReader(new FileReader("resources/input.txt"))) {
            System.out.println(br.readLine());
            StringBuffer sb = new StringBuffer(500);
            CharBuffer cb = CharBuffer.wrap(sb);
            br.read(cb);
            System.out.println(br.readLine());
            System.out.println(cb.get());
        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }
}
