package com.example.ejercicio1listener;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button idBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBut = (Button)findViewById(R.id.button);
        idBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hello World", Toast.LENGTH_SHORT).show();
            }
        });
    }
}