package com.example.ejercicio3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    RadioButton rb1, rb2, rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton)findViewById(R.id.Tennis);
        rb2 = (RadioButton)findViewById(R.id.Soccer);
        rb3 = (RadioButton)findViewById(R.id.Golf);

        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Haz seleccionado Tennis", Toast.LENGTH_SHORT).show();
            }
        });

        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Haz seleccionado Soccer", Toast.LENGTH_SHORT).show();
            }
        });

        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Haz seleccionado Golf", Toast.LENGTH_SHORT).show();
            }
        });

    }
}