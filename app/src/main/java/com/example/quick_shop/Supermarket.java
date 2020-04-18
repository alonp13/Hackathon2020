package com.example.quick_shop;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Serializable {
    String mName;
    List<Category> mCategories;
    int[][] mBlueprint;
    List<Shelf> shelves;

    public Supermarket(String name) {
        mName = name;
        mCategories = new ArrayList<Category>();
    }

    public Supermarket(String name,List<Category> categories, int[][] blueprint) {
        mName = name;
        mCategories = new ArrayList<Category>();
        mCategories.addAll(categories);
        setBlueprint(blueprint);

    }

    public void setBlueprint(int[][] blueprint) {
        mBlueprint = blueprint;
        initData();
    }

    private void initData() {
        shelves = new ArrayList<Shelf>();
    }

    @Override
    public String toString() {
        return mName;
    }


    public int[][] getBlueprint() {
        return mBlueprint;
    }
}
