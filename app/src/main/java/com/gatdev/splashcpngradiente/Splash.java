package com.gatdev.splashcpngradiente;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    RelativeLayout activity_splash;
    private TextView textView;
    private ImageView imageView;
    private TextView txtgatdev;
    AnimationDrawable animationDrawable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        textView = (TextView) findViewById(R.id.txtsplash);
        txtgatdev = (TextView) findViewById(R.id.txtgatdev);
        imageView = (ImageView) findViewById(R.id.imagesplash);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translacion);
        textView.startAnimation(animation);
        txtgatdev.startAnimation(animation);
        imageView.startAnimation(animation);
        final Intent i = new Intent(this,MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    //Duración de la animación
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
        timer.start();

    }
}

