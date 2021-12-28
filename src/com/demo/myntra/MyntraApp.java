package com.demo.myntra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyntraApp {

    private static Map<Integer, Product> products = new TreeMap<>();
    private static Map<String,Integer> productQuantities = new HashMap<>();

    public static void main(String[] args) {
        readFileWithBufferedReader();
    }

    private static void readFileWithBufferedReader() {
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
        try (BufferedReader br = new BufferedReader(
                new FileReader("resources/products.txt"))) {

            String inputLine = "";
            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
                String[] fields = inputLine.split(",");
                for (String field : fields) {
                    System.out.println(field);
                }
                Product product = new Product(Integer.valueOf(fields[0]), fields[1],
                        Double.valueOf(fields[2]), Double.valueOf(fields[3]), fields[4]);
                products.put(product.getId(), product);
            }

            for (Object val : products.entrySet()
                    .toArray()) {
                System.out.println(val);
            }

            productQuantities.put("Shirt",50);
            productQuantities.put("Pant",100);
            productQuantities.put("Saree",60);

        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }
}
