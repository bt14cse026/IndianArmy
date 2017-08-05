package com.example.vikram.indianarmy;
import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by VIKRAM on 7/26/2017.
 */
public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private static ImageView im1,im2,im3,im4,im5,im6,im7,im8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homeactivity);
        im1=(ImageView) findViewById(R.id.imageView3);
        im2=(ImageView) findViewById(R.id.imageView4);
        im3=(ImageView) findViewById(R.id.imageView5);
        im4=(ImageView) findViewById(R.id.imageView6);
        im5=(ImageView) findViewById(R.id.imageView7);
        im6=(ImageView) findViewById(R.id.imageView8);
        im7=(ImageView) findViewById(R.id.imageView9);
        im8=(ImageView) findViewById(R.id.imageView10);
        im1.setOnClickListener(this);
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
        im4.setOnClickListener(this);
        im5.setOnClickListener(this);
        im6.setOnClickListener(this);
        im7.setOnClickListener(this);
        im8.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView3:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView4:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView5:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView6:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView7:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView8:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView9:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
            case R.id.imageView10:
                startActivity(new Intent(getApplicationContext(),DonarTable.class));
                break;
        }
    }
}
