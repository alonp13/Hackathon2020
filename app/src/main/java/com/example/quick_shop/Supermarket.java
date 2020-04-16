package com.example.quick_shop;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    String mName;
    List<Category> mCategories;
    int[][] mBlueprint;

    public Supermarket(String name) {
        mName = name;
        mCategories = new ArrayList<Category>();
    }

    public Supermarket(String name,List<Category> categories, int[][] blueprint) {
        mName = name;
        mCategories = new ArrayList<Category>();
        mCategories.addAll(categories);
        mBlueprint = blueprint;
    }

    public void setBlueprint(int[][] blueprint) {
        mBlueprint = blueprint;
    }

}
