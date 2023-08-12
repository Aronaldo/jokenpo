package com.example.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //capturar elemento texto
        var textView = findViewById<TextView>(R.id.textView)

        //capturar elemento botao
        var campoTexto = findViewById<EditText>(R.id.editTextTextPersonName)


        //capturar elemento botao
        var botao = findViewById<Button>(R.id.button)

        botao.setOnClickListener {

            var texto = campoTexto.text.toString()

            if( texto.trim() != ""){
            textView.text = texto

        }else{
            Toast.makeText( this, "${texto}", Toast.LENGTH_SHORT ).show()

        }


        }
    }
}