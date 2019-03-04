package com.example.india.quizpost;

import android.content.Intent;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreen extends AppCompatActivity {
    ImageView welcomeScreenLogo;
    TextView splashtxt;

//    PreferenceManager preferenceManager = new PreferenceManager(Splashscreen.this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);
        splashtxt = findViewById(R.id.splashtxt);
        welcomeScreenLogo = findViewById(R.id.welcomeScreenLogo);

        final Intent i = new Intent(Splashscreen.this,Login.class);
        welcomeScreenLogo=findViewById(R.id.welcomeScreenLogo);


        Animation splash= AnimationUtils.loadAnimation(this,R.anim.splash);
        welcomeScreenLogo.setAnimation(splash);




        new Handler().postDelayed(new Runnable() {
                                      @Override
                                      public void run() {
                                          startActivity(i);
                                          finish();
                                      }
                                  },
                4000);




    }

    }





