package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void funcio(View e){
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.textExemple);
        textView.setText("HelloWorld!");
        textView.setTextSize(80);

    }

    public void funcio2(View e){
        setContentView(R.layout.activity_main);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Alert exemple");
        builder.setMessage("Hello world!");
        builder.setPositiveButton("OK",null);
        builder.create();
        builder.show();

    }
}