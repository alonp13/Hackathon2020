package com.example.quick_shop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

public class PathView extends View {

    Paint paint;

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

    @Override
    public void onDraw(Canvas canvas) {

    }


}
