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

    private void init() {
        paint.setColor(Color.BLACK);
    }

    public MarketScreen(Context context) {
        super(context);
        paint = new Paint();
        init();
    }

    public MarketScreen(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        init();
    }

    public MarketScreen(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
        init();
    }

    @Override
    public void onDraw(Canvas canvas) {

    }
}
