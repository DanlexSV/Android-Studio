package com.example.ejercicio4;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    int i = 0, j = 0, k = 0;
    Button idBut;
    RadioButton rb1, rb2, rb3;
    TextView tx1, tx2, tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBut = findViewById(R.id.buttonE);

        rb1 = (RadioButton)findViewById(R.id.Tennis);
        rb2 = (RadioButton)findViewById(R.id.Soccer);
        rb3 = (RadioButton)findViewById(R.id.Golf);

        tx1 = (TextView)findViewById(R.id.textTennis);
        tx2 = (TextView)findViewById(R.id.textSoccer);
        tx3 = (TextView)findViewById(R.id.textGolf);

        rb1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                i = 1;
                j = 0;
                k = 0;
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                i = 0;
                j = 1;
                k = 0;
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                i = 0;
                j = 0;
                k = 1;
            }
        });

        idBut.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                tx1.setText("Has seleccionado Tennis");
                tx2.setText("Has seleccionado Soccer");
                tx3.setText("Has seleccionado Golf");
                if (i == 1) {
                    tx1.setVisibility(View.VISIBLE);
                    tx2.setVisibility(View.INVISIBLE);
                    tx3.setVisibility(View.INVISIBLE);
                } else if (j == 1) {
                    tx2.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.INVISIBLE);
                    tx3.setVisibility(View.INVISIBLE);
                } else if (k == 1) {
                    tx3.setVisibility(View.VISIBLE);
                    tx1.setVisibility(View.INVISIBLE);
                    tx2.setVisibility(View.INVISIBLE);
                }
            }
        });

    }
}