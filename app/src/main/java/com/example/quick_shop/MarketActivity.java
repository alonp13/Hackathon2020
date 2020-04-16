package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

public class MarketActivity extends AppCompatActivity {

    MarketScreen marketScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Supermarket marketChose = (Supermarket) getIntent().getExtras().get("com.example.quick_shop.MARKET_CHOSE");
        setTitle(marketChose+"");

        setContentView(R.layout.activity_market);

        marketScreen = new MarketScreen(this,marketChose);
        marketScreen.setBackgroundColor(Color.WHITE);
        setContentView(marketScreen);
    }
}
