package com.example.kotlinwithpzy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


// clase implicita de datos(Data class)
data class Cursos(val nombre: String, val url:String)

class MainActivity : AppCompatActivity() {

    val react =  Cursos("react","react")
    val kot = Cursos("Kotlin","kotlin")
    var cursoActual=react.copy()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.botoncito)
        button.setOnClickListener {
            view ->  switchCursor(cursoActual)
        }
        //verEnPantalla("cursos de ${cursoActual.nombre}  en platzi.com: ${cursoActual.url}")
    }

    fun switchCursor(curso : Cursos){
         cursoActual = curso.copy()

        when(curso.url){
            "react" -> cursoActual= kot.copy()
            "kotlin" -> cursoActual = react.copy()
            else -> println("esto es imposible")
        }


        verEnPantalla("cursos de ${cursoActual.nombre}  en platzi.com: ${cursoActual.url}")

    }

    fun verEnPantalla(s : String){
        val txt: TextView= findViewById(R.id.mensaje)
        txt.setText(s)

    }
}
