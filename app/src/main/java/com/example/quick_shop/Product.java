package com.example.quick_shop;

public class Product {
    private String mName;
    private String mBrand;

    public Product(String name, String brand) {
        mName = name;
        mBrand = brand;

    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getName() {
        return mName;
    }

    public String getBrand() {
        return  mBrand;
    }

}
