package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MarketActivity extends AppCompatActivity {

    private Supermarket marketSelected;
    private ArrayList<Product> productsSelected;

    private MarketView marketView;
    private PathView pathView;

    private TextView itemDetailsTextView;
    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_market);

        marketSelected = (Supermarket) getIntent().getExtras().get("com.example.quick_shop.MARKET_SELECTED");
        productsSelected = (ArrayList<Product>) getIntent().getExtras().get("com.example.quick_shop.PRODUCTS_SELECTED");

        marketView = (MarketView) findViewById(R.id.myView);
        marketView.setBackgroundResource(R.drawable.gradinat_background);
        Canvas canvas = new Canvas();
        marketView.setSupermarket(marketSelected);
        marketView.draw(canvas);

        pathView = new PathView(this);
        pathView.setSupermarket(marketSelected);
        addContentView(pathView,marketView.getLayoutParams());

        itemDetailsTextView = (TextView) findViewById(R.id.itemDetailsTextView);
        nextBtn = (Button) findViewById(R.id.nextBtn);
    }
}
