package com.example.quick_shop;

public class Product {
    private String mName;
    private String mBrand;
    private Category mCategory;

    public Product(String name, String brand, Category category) {
        mName = name;
        mBrand = brand;
        mCategory = category;
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

    public Category getCategory() {
        return mCategory;
    }

}
