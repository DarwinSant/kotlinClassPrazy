package com.example.kotlinwithpzy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // clase implicita de datos(Data class)
     data class Cursos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt: TextView= findViewById(R.id.mensaje)
        txt.setText("si funciona")
    }
}
