package com.demo.myntra;

public class CustomerNotCreatedException extends Exception{

    int exceptionCode;
    String message = "Customer not created.";

    public CustomerNotCreatedException(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }

    public String getChildClassMessage(){
        return this.message;
    }
}
