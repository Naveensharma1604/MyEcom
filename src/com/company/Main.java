package com.company;

import com.company.models.Cart;
import com.company.models.Product;
import com.company.models.Varient;
import java.util.ArrayList;
import java.util.*;



public class Main {

    public static void main(String[] args) {

      Product apple = new Product("apple"," ",1,100)
              ,orange = new Product("orange"," ",0.5f,80)
              ,kiwi = new Product("kiwi"," ", new ArrayList<>(
                      Arrays.asList(new Varient("500g",50),
                              new Varient("1Kg",100)

      )))
              , surfExcel=new Product("surfExcel"," ",new ArrayList<>(
              Collections.singletonList(new Varient("1kg", 150))
      ));
      Cart cart = new Cart();
      cart.add(apple,2.4f);
        cart.add(kiwi,kiwi.variants.get(1));
        cart.add(kiwi,kiwi.variants.get(1));
        cart.add(kiwi,kiwi.variants.get(1));

        cart.decrement(kiwi,kiwi.variants.get(1));
        System.out.print(cart);
    }


}
