package com.demo.myntra;

public class OutOfStockException extends Exception{
    public OutOfStockException(String message) {
        super(message);
    }
}
