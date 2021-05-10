package com.company.models;

public class WeightBasedProduct extends Product{
    float mQuantity;
    float pricePerKg;

    public WeightBasedProduct(float mQuantity, float pricePerKg,String name,String imageUrl) {
        super(name, imageUrl);
        this.mQuantity = mQuantity;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public String toString() {
        return "WeightBasedProduct{" +
                "name='" + name + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", mQuantity=" + mQuantity +
                ", pricePerKg=" + pricePerKg +
                '}';
    }
}
