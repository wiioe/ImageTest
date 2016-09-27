package kr.hs.e_mirim.grace0106.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;

/**
 * Created by appcreator39 on 2016. 9. 26..
 */
public class MyImage extends View {
    int choose = MainActivity.ORIGINAL;
    Bitmap picture;
    MyImage (Context context) {
        super(context);
        picture = BitmapFactory.decodeResource(getResources(),R.drawable.vv);
    }

    public void setChoose (int choose) {
        this.choose = choose;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        float cx = getWidth()/2.0f;
        float cy = getWidth()/2.0f;
        float x = (getWidth()-picture.getWidth())/2.0f;
        float y = (getHeight()-picture.getHeight())/2.0f;

        //canvas.rotate(45, cx, cy);   회전
        //canvas.translate(-150,200);  이동
        //canvas.scale(1,1,cx,cy);     크기
        //canvas.skew(0.4f, 0.4f);     비틀기

        switch (choose) {
            case MainActivity.ROTATE:
                canvas.rotate(45, cx, cy);
                break;
            case MainActivity.TRANSLATE:
                canvas.translate(-150,200);
                break;
            case MainActivity.SCALE:
                canvas.scale(1,1,cx,cy);
                break;
            case MainActivity.SKEW:
                canvas.skew(0.4f, 0.4f);
        }

        canvas.drawBitmap(picture, x, y, null);
        //picture.recycle();
    }
}
