package com.example.quick_shop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String mName;
    List<Product> mProducts;

    public Category(String name) {
        mName = name;
        mProducts = new ArrayList<Product>();
    }

    public Category(String name,List<Product> products) {
        mName = name;
        mProducts = new ArrayList<Product>();
        mProducts.addAll(products);
    }

    public void addProduct(Product product) {
        mProducts.add(product);
    }

    public void addProducts(List<Product> products) {
        mProducts.addAll(products);
    }
}
