package com.example.quick_shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.constraintlayout.solver.widgets.Rectangle;

public class MarketScreen extends View {

    Paint paint;

    private void init() {
        paint.setColor(Color.BLACK);
    }

    public MarketScreen(Context context) {
        super(context);
        paint = new Paint();
    }

    public MarketScreen(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MarketScreen(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    @Override
    public void onDraw(Canvas canvas) {
//        int[][] arr = TempData.arr;
//        for(int i = 0; i < arr.length;i++) {
//            for(int j = 0 ; i < arr[0].length ; j++) {
//
//            }
//        }



        canvas.drawLine(0, 0, canvas.getWidth(), canvas.getHeight(), paint);
        canvas.drawLine(canvas.getWidth(), 0, 0, canvas.getHeight(), paint);

        Log.d("getWidth",canvas.getHeight()+"");

    }
}
