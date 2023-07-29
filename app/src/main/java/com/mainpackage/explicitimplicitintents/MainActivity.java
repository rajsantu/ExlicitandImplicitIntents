package com.mainpackage.explicitimplicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mainpackage.exlicitandimplicitintents.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView txtView = findViewById(R.id.textView);
       Button btnExplicit = findViewById(R.id.btnExplicit);
       Button btnImplicit = findViewById(R.id.btnImplicit);

        btnExplicit.setOnClickListener(view -> {

            // Explicit Intent
            Intent intent =new Intent(getApplicationContext(), Activity2.class);

            intent.putExtra("id","1000");

            startActivity(intent);

        });

        btnImplicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Implicit Intent:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://github.com/rajsantu/ExplicitImplicitIntents"));
                startActivity(intent);
            }
        });

    }
}