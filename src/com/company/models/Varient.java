package com.company.models;

public class Varient {
    String name;
    float price;

    public Varient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s @ Rs. %1f",name,price);
    }
}
