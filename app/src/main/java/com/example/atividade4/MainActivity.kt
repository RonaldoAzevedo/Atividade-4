package com.example.atividade4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.atividade4.model.Produto
import com.example.atividade4.ui.recycler.view.adapter.ListaProdutosAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = ListaProdutosAdapter(context = this, produtos = listOf(
            Produto(nome = "teste",
                descricao = "teste desc",
                valor = BigDecimal("19.99")
            ),
            Produto(nome = "teste 1",
                descricao = "teste desc 1",
                valor = BigDecimal("29.99")
            ),
            Produto(nome = "teste 2",
                descricao = "teste desc 2",
                valor = BigDecimal("39.99")
            ),
        ))
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener{
            val intent = Intent(this, CadastroProduto::class.java)
            startActivity(intent)
        }
        val exit = findViewById<ImageButton>(R.id.imageButton)
        exit.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }

}