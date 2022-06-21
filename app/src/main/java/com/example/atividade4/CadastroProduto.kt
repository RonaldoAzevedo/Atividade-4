package com.example.atividade4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.atividade4.model.Produto
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class CadastroProduto : AppCompatActivity(R.layout.activity_cadastro_produto) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val botaoSalvar = findViewById<Button>(R.id.botaoSalvar)
        botaoSalvar.setOnClickListener{
            val campoNome = findViewById<EditText>(R.id.nomeItem)
            val nome = campoNome.text.toString()
            val descricaoItem = findViewById<EditText>(R.id.descricaoItem)
            val descricao = descricaoItem.text.toString()
            val valorItem = findViewById<EditText>(R.id.valorItem)
            val valorEmTexto = valorItem.text.toString()
            val valor = if(valorEmTexto.isBlank()){
                BigDecimal.ZERO
            }else{
                BigDecimal(valorEmTexto)
            }

            val produtoNovo = Produto(
                nome = nome,
                descricao = descricao,
                valor = valor,
            )
            Log.i("CadastroProduto", "OnCreate: $produtoNovo")

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)


        }
    }
}