package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;

public class MarketActivity extends AppCompatActivity {

    MarketView marketView;
    PathView pathView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        Supermarket marketChose = (Supermarket) getIntent().getExtras().get("com.example.quick_shop.MARKET_CHOSE");
        setTitle(marketChose+"");

        setContentView(R.layout.activity_market);

        marketView = new MarketView(this,marketChose);
        marketView.setBackgroundResource(R.drawable.gradinat_background);
        setContentView(marketView);

        pathView = new PathView(this,marketChose);
        addContentView(pathView,marketView.getLayoutParams());

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        Log.i("point","x: "+event.getX()+", y: "+event.getY());
        return true;
    }
}
