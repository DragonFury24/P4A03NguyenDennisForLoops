package com.dragonfury.duy.p4a03nguyendennisforloops;
//Modulo means remainder of a division problem
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/**
 * Created by 1383504 on 11/30/2016.
 */
public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint nam = new Paint();
        RectF nammy = new RectF(getLeft(),getTop(), (float) (.125*getWidth()), (float) (.125*getHeight()));
        for (int h = 1; h <= 8; h++) {
            for (int i = 0; i < 8; i++) {
                if ((i+h) % 2 == 0){
                    nam.setColor(Color.RED);
                    canvas.drawRect(nammy, nam);
                    nam.setColor(Color.BLACK);
                    canvas.drawCircle(nammy.centerX(), nammy.centerY(), nammy.width() / 2, nam);
                }
                else {
                    nam.setColor(Color.BLACK);
                    canvas.drawRect(nammy, nam);
                    nam.setColor(Color.RED);
                    canvas.drawLine(nammy.left, nammy.top, nammy.right, nammy.bottom, nam);
                    canvas.drawLine(nammy.right, nammy.top, nammy.left, nammy.bottom, nam);
                }
                nammy.offset(nammy.width(),0);
            }
            nammy.offsetTo(getLeft(),nammy.height()*h);
        }
    }
}
