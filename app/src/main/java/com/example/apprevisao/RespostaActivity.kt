package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.apprevisao.db.DBHelper

class RespostaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resposta)

        val edtNome: EditText = findViewById(R.id.edtNome)
        val edtEndereco: EditText = findViewById(R.id.edtEndereco)
        val edtBairro: EditText = findViewById(R.id.edtBairro)
        val edtCep: EditText = findViewById(R.id.edtEndereco)
        val btnConfirmar: Button = findViewById(R.id.btnConfirmar)


        //SQLite
        val db = DBHelper(this, null)

        btnConfirmar.setOnClickListener{
            db.addPessoa(edtNome.text.toString(), edtEndereco.text.toString(), edtBairro.text.toString(), edtCep.text.toString())
            finish()

        }
    }
}