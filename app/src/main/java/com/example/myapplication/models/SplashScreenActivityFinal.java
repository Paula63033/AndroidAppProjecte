package com.example.myapplication.models;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;

public class SplashScreenActivityFinal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_final);
        startActivity(new Intent(SplashScreenActivityFinal.this, MainActivity.class));
        finish();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreenActivityFinal.this, MainActivity.class);
                startActivity(i);
                //close this activity
                finish();
            }
        }, 3000);
    }
}