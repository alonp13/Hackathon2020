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

import java.util.ArrayList;


public class MarketScreen extends View {

    private Paint paint;
    private Supermarket mSupermarket;
    private int[][] bluePrint;
    private int xScale;
    private int yScale;


    private void init(Supermarket supermarket) {
        paint.setColor(Color.BLACK);
        mSupermarket = supermarket;
        bluePrint = mSupermarket.getBlueprint();

        xScale = (int)(this.getWidth()/bluePrint.length);
        yScale = (int)(this.getHeight()/bluePrint[0].length);

    }


    public MarketScreen(Context context,Supermarket supermarket) {
        super(context);
        paint = new Paint();
        mSupermarket = supermarket;
        bluePrint = mSupermarket.getBlueprint();



        Log.d("init","init created");
        // init(supermarket);
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
//        for(int i = 0 ; i < TempData.bigMarketShelves.length ; i ++) {
//            Rect rect = TempData.bigMarketShelves[i].getLocation();
//            canvas.drawRect(rect,paint);
//        }

        xScale = (int)((this.getWidth()+59)/bluePrint[0].length);
        yScale = (int)((this.getHeight()+80)/bluePrint.length);

        Log.d("params","getWIdth: "+this.getWidth()+", getHeight: "+this.getHeight());
        Log.d("ondraw","ondraw created");

        ArrayList<Rect> rects = new ArrayList<Rect>();
        ArrayList<Rect> bluRects = new ArrayList<Rect>();

        for(int i = 0 ; i<bluePrint.length;i++) {
            for (int j = 0 ; j < bluePrint[0].length;j++) {
                if(bluePrint[i][j] == 1) {
                    Rect rect = new Rect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale);
                    rects.add(rect);
                }
                if(bluePrint[i][j] == 2){
                    Rect rect = new Rect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale);
                    bluRects.add(rect);
                }
            }
        }
        Log.d("rects",rects.toString());
        Log.d("scales","x: "+xScale+" ,y: "+yScale);

        paint.setColor(Color.DKGRAY);
        for(Rect rect : bluRects) {
            canvas.drawRect(rect,paint);
        }
        paint.setColor(Color.CYAN);
        for(Rect rect : rects) {
            canvas.drawRect(rect,paint);
        }

    }
}
