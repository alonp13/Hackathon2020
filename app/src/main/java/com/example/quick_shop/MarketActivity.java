package com.example.quick_shop;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MarketActivity extends AppCompatActivity {



    MarketView marketView;
    PathView pathView;

    TextView itemDetailsTextView;
    Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_market);


        Supermarket marketChose = (Supermarket) getIntent().getExtras().get("com.example.quick_shop.MARKET_CHOSE");
        setTitle(marketChose+"");

        marketView = (MarketView) findViewById(R.id.myView);
        marketView.setBackgroundResource(R.drawable.gradinat_background);
        Canvas canvas = new Canvas();
        marketView.setSupermarket(marketChose);
        marketView.draw(canvas);

        pathView = new PathView(this,marketChose);
        addContentView(pathView,marketView.getLayoutParams());

        itemDetailsTextView = (TextView) findViewById(R.id.itemDetailsTextView);
        nextBtn = (Button) findViewById(R.id.nextBtn);



    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        super.onTouchEvent(event);
        Log.d("x",event.getX()+"");
        Log.d("y",event.getY()+"");
        return true;
    }
}
