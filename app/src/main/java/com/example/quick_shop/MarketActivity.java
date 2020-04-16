package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MarketActivity extends AppCompatActivity {

    MarketScreen ms;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_market);

        ms = new MarketScreen(this);
        ms.setBackgroundColor(Color.WHITE);
        setContentView(ms);
    }
}
