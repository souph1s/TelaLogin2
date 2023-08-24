package com.example.aplicativodasophi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val nomeUsuario = intent.getStringExtra("nomeUsuario")
        var textViewUsuario: TextView = findViewById(R.id.textViewUsuario)
        textViewUsuario.text = nomeUsuario
    }
}