package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

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

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        Log.i("point","x: "+event.getX()+", y: "+event.getY());
        return true;
    }
}
