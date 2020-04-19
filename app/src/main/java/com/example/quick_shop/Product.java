package com.example.quick_shop;

public class Product {
    private String mName;
    private String mBrand;
    private String mGroceries;

    public Product(String name, String brand, String groceries) {
        mName = name;
        mBrand = brand;
        mGroceries =groceries;

    }
    public String getmGroceries() {
        return mGroceries;
    }

    public void setGroceries(String mGroceries) {
        this.mGroceries = mGroceries;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public void setBrand(String mBrand) {
        this.mBrand = mBrand;
    }

    public String getName() {
        return mName;
    }

    public String getBrand() {
        return  mBrand;
    }

}
