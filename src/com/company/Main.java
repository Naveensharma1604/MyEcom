package com.company;

import com.company.models.Product;
import com.company.models.Varient;
import com.company.models.VarientBasedProduct;
import com.company.models.WeightBasedProduct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Product apple = new WeightBasedProduct(1,100,"Apple","");
        Product orange = new WeightBasedProduct(1,80,"Orange"," ");
        Product Kiwi = new VarientBasedProduct("kiwi","",new ArrayList<>(
                Arrays.asList(new Varient("500g",150),new Varient("1kg",300))));


        List<Product> products = new ArrayList<>(
                Arrays.asList(apple,orange,Kiwi)
        );
        System.out.println(products);

    }
}
