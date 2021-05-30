package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.adapter.NotasAdapter
import com.example.recycler.modelo.Nota

class MainActivity : AppCompatActivity() {
    lateinit var recyclerNotas:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerNotas = findViewById(R.id.listaNotas)

        val notas = ArrayList<Nota>()
        notas.add(Nota(titulo = "Primera nota", descripcion = "Mi descripción"))
        notas.add(Nota(titulo = "Segunda nota", descripcion = "Esta es la descrpción de la nota dos "))
        notas.add(Nota(titulo = "Tercera nota", descripcion = "Otra descripción"))
        notas.add(Nota(titulo = "Cuarta nota", descripcion = "Mi descripción"))
        notas.add(Nota(titulo = "Quinta nota", descripcion = "Mi descripción"))
        notas.add(Nota(titulo = "Esta es una nota muy larga", descripcion = "Para tener una frecuencia relativamente normal es comun llevar a cabo una revision de los distintos aspectos dentro del ambito regularmente."))
        notas.add(Nota(titulo = "Titulo de la nota", descripcion = "Asi se veria una descripción de una nota"))
        notas.add(Nota(titulo = "Titulo", descripcion = "Otra descripción"))
        notas.add(Nota(titulo = "Eso es un titulo", descripcion = "Mi descripción"))
        notas.add(Nota(titulo = "Nota", descripcion = "Como como com lore ipsum"))

        recyclerNotas.layoutManager = GridLayoutManager(this, 2)
        recyclerNotas.setHasFixedSize(true)
        recyclerNotas.adapter = NotasAdapter(notas, this)
    }
}