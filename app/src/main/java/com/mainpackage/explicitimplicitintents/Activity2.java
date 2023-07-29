package com.mainpackage.explicitimplicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("id");


        Toast.makeText(this,
                "We passed: "+stringExtra, Toast.LENGTH_SHORT).show();
    }
}