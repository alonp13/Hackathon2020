package com.example.quick_shop;

import androidx.annotation.NonNull;
import java.io.Serializable;

public class Category implements Serializable {

    private String mName;

    public Category(String name) {
        mName = name;
    }

    @NonNull
    @Override
    public String toString() {
        return mName;
    }
}
