package kr.hs.e_mirim.grace0106.imagetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    MyImage mImg;
    static final int ORIGINAL=0;
    static final int ROTATE = 0;
    static final int TRANSLATE=1;
    static final int SCALE=2;
    static final int SKEW=3;
    int choose = ORIGINAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linear1 = (LinearLayout)findViewById(R.id.linear1);
        mImg = new MyImage(getApplicationContext());
        linear1.addView(mImg);
    }

    public void transformImage(View v) {
        switch(v.getId()) {
            case R.id.but_rotate:
                choose=ROTATE;
                break;
            case R.id.but_translate:
                choose=TRANSLATE;
                break;
            case R.id.but_scale:
                choose=SCALE;
                break;
            case R.id.but_skew:
                choose=SKEW;
                break;
        }
        mImg.setChoose(choose);
        mImg.invalidate();
    }

}
