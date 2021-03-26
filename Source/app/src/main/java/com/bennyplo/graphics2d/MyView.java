package com.bennyplo.graphics2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by benlo on 09/05/2018.
 */

public class MyView extends View {
    private Paint whitePaint;

    private Paint bluePaint;

    public MyView(Context context) {
        super(context, null);
        //Add your initialisation code here
        whitePaint =new Paint(Paint.ANTI_ALIAS_FLAG);
        whitePaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        whitePaint.setColor(0xffffffff);//color red
        whitePaint.setStrokeWidth(5);//set the line stroke width to 5

        bluePaint =new Paint(Paint.ANTI_ALIAS_FLAG);
        bluePaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        bluePaint.setColor(0xff0000ff);//color black
        bluePaint.setTextSize(80);
        bluePaint.setStrokeWidth(12);//set the line stroke width to 5
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Add your drawing code here
        canvas.drawRect(10,30,200,200, bluePaint);
        canvas.drawARGB(200, 150, 150, 250);

        canvas.drawCircle(300,300,250,bluePaint);
        canvas.drawCircle(500,450,50,bluePaint);

        canvas.drawRect(500,500,700,700, bluePaint);
        canvas.drawCircle(600,600,144,bluePaint);

        canvas.drawText("Ankit Shukla", 50, 80, bluePaint);
    }
}
