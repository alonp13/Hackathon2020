package com.example.quick_shop;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class Category {
    String mName;

    public Category(String name) {
        mName = name;
    }

    @NonNull
    @Override
    public String toString() {
        return mName;
    }
}
