package com.example.quick_shop;

import java.io.Serializable;
import java.util.List;

public class Supermarket implements Serializable {
    private String mName;
    private int[][] mBlueprint;
    private List<Shelf> mShelves;

    public Supermarket(String name,int[][] blueprint) {
        mName = name;
        mBlueprint = blueprint;
    }

    public void setBlueprint(int[][] blueprint) {
        mBlueprint = blueprint;
    }

    public void initData(List<Shelf> shelves) {
        mShelves = shelves;
    }

    @Override
    public String toString() {
        return mName;
    }

    public int[][] getBlueprint() {
        return mBlueprint;
    }
}
