package com.company.models;

import java.util.List;

public class Product {
    String name,imageUrl;
    int type;
    //Wb items
    float minQty,pricePerKg;
    //VB items
    public List<Varient> variants;

    public Product(String name, String imageUrl, float minQty, float pricePerKg) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.type = ProductType.TYPE_WB;
        this.minQty = minQty;
        this.pricePerKg = pricePerKg;
    }

    public Product(String name, String imageUrl,List<Varient> variants) {
        this.type= ProductType.TYPE_VB;
        this.name = name;
        this.imageUrl = imageUrl;
        this.variants=variants;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       if(type==ProductType.TYPE_WB)
           sb.append("WB {");
       else
           sb.append("VB {");

       sb.append("name = ").append(name);
       if(type==ProductType.TYPE_WB)
       {
           sb.append("minQty = ").append(minQty);
           sb.append("pricePerKg= ").append(pricePerKg);
       }
       else
       {
           sb.append("varients = ").append(variants);
       }
       sb.append("}");
       return sb.toString();

    }
}
