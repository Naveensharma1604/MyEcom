package com.company.models;

public class CartItem {
    String name;
    float unitPrice,qty;

    public CartItem(String name, float unitPrice, float qty) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }

    public float cost(){
        return unitPrice * qty;
    }

    @Override
    public String toString() {
        return "\nCartItem{" +
                "name='" + name + '\'' +
                String.format(" cost =  %f * %f = %f",unitPrice,qty,cost())
               + '}';
    }
}
