package com.example.ejercicio2xml;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    Button idBut;
    TextView idText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBut = findViewById(R.id.button);
        idText = (TextView) findViewById(R.id.textv);

        idBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (idText.getVisibility() == View.INVISIBLE)
                    idText.setVisibility(View.VISIBLE);
                else
                    idText.setVisibility(View.INVISIBLE);
            }
        });
    }
}