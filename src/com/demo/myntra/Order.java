package com.demo.myntra;

import java.util.Objects;

public class Order {
    private int id;
    private Product product;
    private double amount;
    private String address;
    private Customer customer;
    private String status;
    private double tax = 10.67;

    public Order(int id, Product product, String address, Customer customer, String status) {
        this.id = id;
        this.product = product;
        this.address = address;
        this.customer = customer;
        this.status = status;
        this.amount = product.getPrice() + tax;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                //", product=" + product +
                ", amount=" + amount +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", tax=" + tax +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(order.amount, amount) == 0 && Double.compare(order.tax, tax) == 0 && Objects.equals(product, order.product) && Objects.equals(address, order.address) && Objects.equals(customer, order.customer) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, product, amount, address, status, tax);
    }

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }

    public String getAddress() {
        return address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getStatus() {
        return status;
    }
}
