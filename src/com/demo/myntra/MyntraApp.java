package com.demo.myntra;

import java.io.*;
import java.util.*;

public class MyntraApp {

    private static Map<Integer, Product> products = new TreeMap<>();
    private static Map<Integer, Customer> customers = new TreeMap<>();
    private static Map<Integer,Order> myntraOrders = new TreeMap<>();
    private static Map<String, Integer> productQuantities = new HashMap<>();

    public static void main(String[] args) {
        readProductsDataWithBufferedReader();
        showOptionsToUser();
        readUserInput();
    }

    private static void readUserInput() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            //Keep on reading input
            reader.lines()
                    .forEach(line -> {
                        if (line.equalsIgnoreCase("5")) {
                            System.exit(0);
                        } else if (line.equalsIgnoreCase("1")) {
                            readCustomerData(reader);
                        } else if (line.equalsIgnoreCase("2")) {
                            placeOrder(reader);
                        } else if (line.equalsIgnoreCase("3")) {
                            showCustomerOrders(reader);
                        } else {

                        }
                    });
        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }

    private static void showCustomerOrders(BufferedReader reader) {
        try{
            String customerName = reader.readLine();
            customers.forEach((k,v) -> {
                if(v.getName().equals(customerName)){
                    Set<Order> customerOrders = v.getOrders();
                    for(Order o : customerOrders){
                        System.out.println(o);
                    }
                    //customerOrders.forEach( o -> System.out.println(o));
                }
            } );
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void placeOrder(BufferedReader reader) {
        try {
            String orderData = reader.readLine();
            System.out.println(orderData);
            String[] fields = orderData.split(",");
            for (String field : fields) {
                System.out.println(field);
            }

            int productId = Integer.valueOf(fields[0]);
            Product product = products.get(productId);

            int customerId = Integer.valueOf(fields[2]);
            Customer customer = customers.get(customerId);

            int id = myntraOrders.size() + 1;

            Order order = new Order(id, product, fields[1],
                    customer, "NEW");

            customer.getOrders().add(order);

            myntraOrders.put(order.getId(),order);

            String productCategory = product.getCategory();

            int currentQuantity = productQuantities.get(productCategory);
            currentQuantity--;

            System.out.println(currentQuantity);

            productQuantities.put(productCategory,currentQuantity);

            System.out.println(productQuantities.get(productCategory));

            System.out.println(customer);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    private static void readCustomerData(BufferedReader reader) {
        try {
            String customerData = reader.readLine();
            System.out.println(customerData);
            String[] fields = customerData.split(",");
            for (String field : fields) {
                System.out.println(field);
            }
            Customer customer = new Customer(Integer.valueOf(fields[0]), fields[1],
                    Integer.valueOf(fields[2]), fields[3].charAt(0));
            System.out.println(customer);
            customers.put(customer.getId(),customer);
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
    }

    private static void showOptionsToUser() {
        System.out.println("Enter 1 to create customer");
        System.out.println("Enter 2 to place order");
        System.out.println("Enter 3 to view orders placed by customer");
        System.out.println("Enter 4 to show 2 highest amount orders");
        System.out.println("Enter 5 to exit the application");
    }

    private static void readProductsDataWithBufferedReader() {
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

            productQuantities.put("Shirt", 50);
            productQuantities.put("Pant", 100);
            productQuantities.put("Saree", 60);
            productQuantities.forEach((k, v) -> System.out.println(k + " : " + v));

        } catch (Exception e) {
            System.out.println("Exception caught " + e);
            e.printStackTrace();
        }
    }
}
