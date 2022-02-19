package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.models.Game;
import com.example.myapplication.models.SplashScreenActivityFinal;

public class MainActivity extends AppCompatActivity {

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        setContentView(R.layout.activity_main);
    }

    public void alerta(View e){

        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert exemple");
        builder.setMessage("Hello world!");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();

    }
}