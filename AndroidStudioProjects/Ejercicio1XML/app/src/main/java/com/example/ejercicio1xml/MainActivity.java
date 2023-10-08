package com.example.ejercicio1xml;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.os.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    public void changMessage(View v) {
        Toast.makeText(getBaseContext(),"Hello World", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}