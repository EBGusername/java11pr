package com.example.pr1java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    private Button buttor;
    private ImageView Chara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        buttor = findViewById(R.id.buttor);
        Chara = findViewById(R.id.Chara);

        Animation blinckAnimation = AnimationUtils.loadAnimation(this, R.anim.blink_animation);

        
        Chara.startAnimation(blinckAnimation);

        buttor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,
                        MainActivity.class);
                startActivity(intent);
            }
        });
    }
}