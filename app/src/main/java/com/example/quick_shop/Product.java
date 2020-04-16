package com.example.quick_shop;

public class Product {
    private String mName;
    private String mBrand;
    private String mgroceries;

    public Product(String name, String brand, String groceries) {
        mName = name;
        mBrand = brand;
        mgroceries =groceries;

    }
    public String getMgroceries() {
        return mgroceries;
    }

    public void setMgroceries(String mgroceries) {
        this.mgroceries = mgroceries;
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
