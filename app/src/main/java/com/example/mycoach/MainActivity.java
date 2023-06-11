package com.example.mycoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton logoBtn = (ImageButton) findViewById(R.id.imageButton);
        logoBtn.setImageResource(R.drawable.mycoach);
        logoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchApp();
            }
        });
    }

    private void launchApp() {
        Intent switchActivityIntent = new Intent(this, SelectProgramme.class);
        startActivity(switchActivityIntent);
    }
}