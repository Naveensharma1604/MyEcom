package com.company.models;

import java.util.HashMap;

public class Cart {
    HashMap<String,CartItem> cartItem = new HashMap<>();
    float total , noOfItems;
    //WBP adding
    public void add(Product product,float qty)
    {
        if(cartItem.containsKey(product.name))
        {
            total-= cartItem.get(product.name).cost();
            cartItem.get(product.name).qty=qty;
        }
        else {
            CartItem item = new CartItem(product.name, product.pricePerKg, qty);
            cartItem.put(product.name,item);
            noOfItems++;
        }
        total += product.pricePerKg*qty;
    }
    public void add(Product product,Varient varient)
    {
        String key = product.name + " "+ varient.name;
        if(cartItem.containsKey(key))
            cartItem.get(key).qty++;
        else{
            CartItem item = new CartItem(product.name, varient.price,1);
            cartItem.put(key,item);

        }
        noOfItems++;
        total+= varient.price;
    }
    public void remove(Product product) {
        if(product.type == ProductType.TYPE_WB)
            removeWBP(product);
        else
            removeAllVBP(product);
    }

    //Function for removing Weight Based Products
    private void removeWBP(Product product) {
        total -= cartItem.get(product.name).cost();
        noOfItems--;
        cartItem.remove(product.name);
    }

    //Function for removing all Variant Based Products
    public void removeAllVBP(Product product) {
        for(Varient variant : product.variants) {
            String key = product.name + " " + variant.name;
            if(cartItem.containsKey(key)) {
                total -= cartItem.get(key).cost();
                noOfItems -= cartItem.get(key).qty;
                cartItem.remove(key);
            }
        }
    }

    //Function for decrement the Quantity of Variant Based Products
    public void decrement(Product product, Varient varient) {

        String key = product.name + " " + varient.name;

        //Update Cart Quantity
        cartItem.get(key).qty--;

        //Update Cart Summary
        total -= varient.price;
        noOfItems--;

        //Remove a function when if quantity = 0
        if(cartItem.get(key).qty == 0)
            cartItem.remove(key);

    }

    @Override
    public String toString() {
        return "Cart{" +
                "\n,cartItem=" + cartItem +
                "\n, total=" + total +
                "\n, noOfItems=" + noOfItems +
                '}';
    }

}

