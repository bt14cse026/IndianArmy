package com.example.vikram.indianarmy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeDesign extends AppCompatActivity {
    ImageView image;
    private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_design);
        image = (ImageView) findViewById(R.id.logo);
        AnimationSet s=new AnimationSet(false);

        //create & load animation for app logo
       /* Animation animation = AnimationUtils.loadAnimation(this,R.anim.zoom_out);
        s.addAnimation(animation);
        image.startAnimation(s);*/
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.zoom_in);
        s.addAnimation(animation1);
        image.startAnimation(s);


        //start new activity through handler
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}








