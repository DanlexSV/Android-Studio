package com.example.practica

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var idBut: Button // Usamos lateinit para inicializar más tarde

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        idBut = findViewById(R.id.button)

        idBut.setOnClickListener {
            Toast.makeText(this@MainActivity, "Prueba", Toast.LENGTH_SHORT).show()
        }
    }
}
