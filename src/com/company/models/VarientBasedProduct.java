package com.company.models;

import java.util.List;

public class VarientBasedProduct extends Product{
    List<Varient> varients;
    public VarientBasedProduct(String name, String imageUrl, List<Varient> varients) {
        super(name, imageUrl);
        this.varients = varients;
    }

    @Override
    public String toString() {
        return "VarientBasedProduct{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", varients=" + varients +
                '}';
    }
}
