package com.example.quick_shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.constraintlayout.solver.widgets.Rectangle;

public class MarketScreen extends View {

    Paint paint;
    Supermarket mSupermarket;

    private void init(Supermarket supermarket) {
        paint.setColor(Color.BLACK);
        mSupermarket = supermarket;


    }

    public MarketScreen(Context context,Supermarket supermarket) {
        super(context);
        paint = new Paint();
        init(supermarket);
    }

    public MarketScreen(Context context, AttributeSet attrs,Supermarket supermarket) {
        super(context, attrs);
        paint = new Paint();
        init(supermarket);
    }

    public MarketScreen(Context context, AttributeSet attrs, int defStyle,Supermarket supermarket) {
        super(context, attrs, defStyle);
        paint = new Paint();
        init(supermarket);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Rect rect = new Rect(30,10,50,11);
        canvas.drawRect(rect,paint);
    }
}
