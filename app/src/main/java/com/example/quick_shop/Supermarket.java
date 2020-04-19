package com.example.quick_shop;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Supermarket implements Serializable {
    String mName;
    int[][] mBlueprint;
    List<Shelf> mShelves;

    public Supermarket(String name) {
        mName = name;
    }

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
