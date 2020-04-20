package com.example.quick_shop;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class PathView extends View {

    private Paint paint;
    private Supermarket mSupermarket;
    private int[][] mBlueprint;

    public PathView(Context context) {
        super(context);
        paint = new Paint();

    }

    public PathView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
    }

    public PathView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        paint = new Paint();
    }

    public void setSupermarket(Supermarket supermarket) {
        mSupermarket = supermarket;
    }
}
