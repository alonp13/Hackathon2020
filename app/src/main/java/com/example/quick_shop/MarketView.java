package com.example.quick_shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.solver.widgets.Rectangle;

import java.util.ArrayList;


public class MarketView extends View {

    private Paint paint;
    private Supermarket mSupermarket;
    private int[][] bluePrint;
    private float xScale;
    private float yScale;


    private void init(Supermarket supermarket) {
        paint.setColor(Color.BLACK);
        mSupermarket = supermarket;
        bluePrint = mSupermarket.getBlueprint();

    }

    public MarketView(Context context) {
        super(context);
        paint = new Paint();

    }

    public MarketView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();

    }

    public MarketView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();

    }

    public MarketView(Context context, Supermarket supermarket) {
        super(context);
        paint = new Paint();
        mSupermarket = supermarket;
        bluePrint = mSupermarket.getBlueprint();
    }

    public MarketView(Context context, AttributeSet attrs, Supermarket supermarket) {
        super(context, attrs);
        paint = new Paint();
        init(supermarket);
    }

    public MarketView(Context context, AttributeSet attrs, int defStyle, Supermarket supermarket) {
        super(context, attrs, defStyle);
        paint = new Paint();
        init(supermarket);
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        xScale = ((float)(canvas.getWidth())/(float)bluePrint[0].length);
//        yScale = ((float)(canvas.getHeight())/(float)bluePrint.length);


  //      drawBlueprint(canvas);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        xScale = ((float)(canvas.getWidth())/(float)bluePrint[0].length);
        yScale = ((float)(canvas.getHeight())/(float)bluePrint.length);
        drawBlueprint(canvas);
    }

    public void setSupermarket(Supermarket supermarket) {
        mSupermarket = supermarket;
        bluePrint = mSupermarket.getBlueprint();
    }

    private void drawBlueprint(Canvas canvas) {
        for(int i = 0 ; i<bluePrint.length;i++) {
            for (int j = 0 ; j < bluePrint[0].length;j++) {
                if(bluePrint[i][j] == 1) {
                    paint.setColor(Color.DKGRAY);
                    canvas.drawRect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale,paint);
                }

                if(bluePrint[i][j] == 2){
                    paint.setColor(Color.WHITE);
                    canvas.drawRect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale,paint);
                }
            }
        }
    }
}
