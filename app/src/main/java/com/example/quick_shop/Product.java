package com.example.quick_shop;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.io.Serializable;

public class Product implements Serializable {

    private String mName;
    private String mBrand;
    private Category mCategory;

    public Product(String name, String brand, Category category) {
        mName = name;
        mBrand = brand;
        mCategory = category;
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

    @NonNull
    @Override
    public String toString() {
        return mName + "|" + mBrand;
    }

    @Override
    public boolean equals(@Nullable Object obj) {
        if(!(obj instanceof Product)) return false;
        Product other = (Product) obj;
        return this.mName == other.getName() && this.mBrand == other.getBrand();
    }
}
