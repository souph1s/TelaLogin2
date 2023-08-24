package com.example.aplicativodasophi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onRestart() {
        super.onRestart()
    }



    fun proximaTela (nomeUsuario: String){
        val novaTela: Intent = Intent(this, Home::class.java)
        novaTela.putExtra("nomeUsuario", nomeUsuario)
        startActivity(novaTela)
    }

    fun botaoLogin (elemento : View){
        val editTextUsername: EditText = findViewById(R.id.editTextUsername)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
       // val textViewErros: TextView = findViewById(R.id.textViewErros)
        val username = editTextUsername.text.toString()
        if (username.equals("admin")) {
            if (editTextPassword.text.toString().equals("123")) {
                proximaTela(username)
                finish()
            } else {
                Toast.makeText(this, "Senha Invalida", Toast.LENGTH_LONG).show()
                //textViewErros.text = "Senha Invalida"
            }
        } else {
            Toast.makeText(this, "Usuario Invalido", Toast.LENGTH_LONG).show()
        }
    }
}