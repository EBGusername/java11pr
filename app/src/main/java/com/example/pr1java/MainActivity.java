package com.example.pr1java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.AnnotatedElement;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private  Button Frame;
    private  Button Tween;
    private AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        Frame = findViewById(R.id.Framebutton);
        Tween = findViewById(R.id.Tweenbutton);

        animationDrawable = (AnimationDrawable) imageView.getDrawable();

        if(!animationDrawable.isRunning()){
            animationDrawable.start();
        }

        Frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity2.class);
                startActivity(intent);
            }
        });

        Tween.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        MainActivity3.class);
                startActivity(intent);
            }
        });

    }
}