package com.example.quick_shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


public class MarketView extends View {

    private Paint paint;
    private Supermarket mSupermarket;
    private int[][] mBluePrint;
    private float xScale;
    private float yScale;

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

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        xScale = ((float)(canvas.getWidth())/(float) mBluePrint[0].length);
        yScale = ((float)(canvas.getHeight())/(float) mBluePrint.length);

        drawBlueprint(canvas);
    }

    public void setSupermarket(Supermarket supermarket) {
        mSupermarket = supermarket;
        mBluePrint = mSupermarket.getBlueprint();
    }

    private void drawBlueprint(Canvas canvas) {
        if(mSupermarket == null || mBluePrint == null) {
            throw new RuntimeException("Market or bluePrint isn't initialized");
        }

        for(int i = 0; i< mBluePrint.length; i++) {
            for (int j = 0; j < mBluePrint[0].length; j++) {
                if(mBluePrint[i][j] == 1) {
                    paint.setColor(Color.DKGRAY);
                    canvas.drawRect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale,paint);
                }

                if(mBluePrint[i][j] == 2){
                    paint.setColor(Color.WHITE);
                    canvas.drawRect(j*xScale,i*yScale,(j+1)*xScale,(i+1)*yScale,paint);
                }
            }
        }
    }
}
