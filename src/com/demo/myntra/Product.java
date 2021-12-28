package com.demo.myntra;

import java.util.Objects;

public class Product {
    protected int id;
    protected String category;
    protected double price;
    protected double rating;
    protected String brand;

    public Product(int id, String category, double price, double rating, String brand) {
        this.id = id;
        this.category = category;
        this.price = price;
        this.rating = rating;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && Double.compare(product.rating, rating) == 0 && Objects.equals(category, product.category) && Objects.equals(brand, product.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, category, price, rating, brand);
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public String getBrand() {
        return brand;
    }
}
