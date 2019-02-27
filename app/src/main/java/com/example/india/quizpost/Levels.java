package com.example.india.quizpost;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class Levels extends AppCompatActivity {
    ViewFlipper flip;
    Button offline;

    int Images[]={R.drawable.trophy,R.drawable.test,R.drawable.brain,R.drawable.pencil};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        offline=findViewById(R.id.offline);
        flip=findViewById(R.id.flip);

        offline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Levels.this,Dashboard.class);
                startActivity(i);
            }
        });



        for (int image:Images){
            flipperImage(image);
        }

    }
    public void flipperImage(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        flip.addView(imageView);
        flip.setFlipInterval(3000);//4sec
        flip.setAutoStart(true);

        //animation

        flip.setInAnimation(this,android.R.anim.slide_in_left);
        flip.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
