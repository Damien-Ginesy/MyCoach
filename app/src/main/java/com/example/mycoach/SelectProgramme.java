package com.example.mycoach;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectProgramme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_programme);
        Button btnForce = (Button) findViewById(R.id.btn_force);
        Button btnEndurance = (Button) findViewById(R.id.btn_endurance);
        Button btnCardio = (Button) findViewById(R.id.btn_cardio);

        Intent forceIntent = new Intent(this, ForceProgram.class);
        Intent enduranceIntent = new Intent(this, EnduranceProgram.class);
        Intent cardioIntent = new Intent(this,CardioProgram.class);

        btnForce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(forceIntent);
            }
        });

        btnEndurance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(enduranceIntent);
            }
        });

        btnCardio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(cardioIntent);
            }
        });
    }
}