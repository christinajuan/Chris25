package com.example.user.chris25;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.print.PrintHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView earth;
    private ObjectAnimator anim1, anim2, anim3, anim4, anim5,anim6;
    private View container;
    private int viewH,viewW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        container = findViewById(R.id.activity_main);
        earth = (ImageView)findViewById(R.id.earth);

    }
    public void test1(View v){
        anim1 = ObjectAnimator.ofFloat(earth,"y", 0,viewH,0);
        anim1.setDuration(2000);
        anim1.setRepeatCount(0);
        anim1.start();
    }
    public void test2(View v){
        anim1 = ObjectAnimator.ofFloat(earth,"y", 0,800);
        anim1.setDuration(2000);
        anim1.setRepeatCount(0);
        anim1.start();
    }

    public void test3(View v){
        anim1 = ObjectAnimator.ofFloat(earth,"x", 0,800);
        anim2 = ObjectAnimator.ofFloat(earth,"y", 0,800);
        anim3 = ObjectAnimator.ofFloat(earth,"alpha", 0f,1f);
        anim4 = ObjectAnimator.ofFloat(earth,"rotationX", 0f,360f,0f,360f);
        anim5 = ObjectAnimator.ofFloat(earth,"rotationY", 0f,360f,0f,360f);
        anim6 = ObjectAnimator.ofFloat(earth,"rotationZ", 0f,360f,0f,360f);

        AnimatorSet set = new AnimatorSet();
        //set.playSequentially(anim1,anim2,anim6);
        set.playTogether(anim6);
        set.setDuration(3*1000);
        set.start();

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            viewH = container.getWidth()-earth.getWidth();
            viewW = container.getHeight()-earth.getHeight();
            Log.v("brad", container.getWidth() + " x " + container.getHeight());
            Log.v("brad", earth.getWidth() + " x " + earth.getHeight());
        }
    }
}
