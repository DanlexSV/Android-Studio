package com.example.ejercicio5;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    Button idBut;
    CheckBox cb1, cb2, cb3;
    TextView tx1, tx2, tx3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idBut = findViewById(R.id.button);

        cb1 = (CheckBox)findViewById(R.id.checkBoxTennis);
        cb2 = (CheckBox)findViewById(R.id.checkBoxSoccer);
        cb3 = (CheckBox)findViewById(R.id.checkBoxGolf);

        tx1 = (TextView)findViewById(R.id.textTennis);
        tx2 = (TextView)findViewById(R.id.textSoccer);
        tx3 = (TextView)findViewById(R.id.textGolf);

        idBut.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                if (cb1.isChecked()) {
                    tx1.setText("Has seleccionado Tennis");
                    tx1.setVisibility(View.VISIBLE);
                } else if (!cb1.isChecked())
                    tx1.setVisibility(View.INVISIBLE);
                if (cb2.isChecked()) {
                    tx2.setText("Has seleccionado Soccer");
                    tx2.setVisibility(View.VISIBLE);
                } else if (!cb2.isChecked())
                    tx2.setVisibility(View.INVISIBLE);
                if (cb3.isChecked()) {
                    tx3.setText("Has seleccionado Golf");
                    tx3.setVisibility(View.VISIBLE);
                } else if (!cb3.isChecked())
                    tx3.setVisibility(View.INVISIBLE);
            }
        });
    }
}