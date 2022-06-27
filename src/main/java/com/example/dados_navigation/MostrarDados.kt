package com.example.dados_navigation

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.gson.Gson

class MostrarDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_dados)

        var gson = Gson()
        var json = intent.getStringExtra("json")

        if (!json.isNullOrEmpty()){
            var objPessoa = gson.fromJson(json, Pessoa::class.java)

            var Nome = findViewById<TextView>(R.id.TvNome)
            var Idade = findViewById<TextView>(R.id.TvIdade)

            Nome.text = "Nome: ${objPessoa.Nome}"
            Idade.text = "Idade: ${objPessoa.Idade}"

            var backButton = findViewById<Button>(R.id.backButton)

            backButton.setOnClickListener{
                finish()
            }
        }




    }
}