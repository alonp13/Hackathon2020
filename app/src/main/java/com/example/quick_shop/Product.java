package com.example.quick_shop;

public class Product {
    private String mName;
    private String mBrand;

    public Product(String name, String brand) {
        mName = name;
        mBrand = brand;
    }

    public String getName() {
        return mName;
    }

    public String getBrand() {
        return  mBrand;
    }

}
