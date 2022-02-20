package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class TermsConditionsPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions_page);
    }

    public void presionaBoton(View e){

        Toast.makeText(this, "Has acceptat els termes i condicions!", Toast.LENGTH_LONG).show();
    }
}