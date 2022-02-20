package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.models.Game;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Game game = new Game();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,AboutPage.class));
                /*Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
            }
        });

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Ajustes.class));
            }
        });

    }

    public void obrirAbout(View e){
        setContentView(R.layout.about);
    }

    public void alerta(View e){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert exemple");
        builder.setMessage("Hello world!");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();

    }


}