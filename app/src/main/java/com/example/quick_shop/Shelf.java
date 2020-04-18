package com.example.quick_shop;

import android.graphics.Rect;

public class Shelf {
    private Rect mLocation;
    private Category mCategory;

    public Shelf(Rect location, Category category) {
        mLocation = location;
        mCategory = category;
    }

    public Rect getLocation() {
        return mLocation;
    }

    public Category getCategoty() {
        return mCategory;
    }

}
