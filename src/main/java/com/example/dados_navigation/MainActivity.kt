package com.example.dados_navigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var gson = Gson()
        var buttonSend = findViewById<Button>(R.id.sendbutton)

        buttonSend.setOnClickListener{
            var Nome = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            var Idade = findViewById<EditText>(R.id.editTextTextPersonAge).text.toString()

            var pessoa: Pessoa = Pessoa(Nome, Idade)

            var json = gson.toJson(pessoa)

            var IntentChange = Intent(this, MostrarDados::class.java)
            IntentChange.putExtra("json", json)
            startActivity(IntentChange)
        }


    }


}