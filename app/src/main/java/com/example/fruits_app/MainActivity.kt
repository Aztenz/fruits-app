package com.example.fruits_app

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        val fruitAdaptor = FruitAdapter(fruitsList())
        val button1: Button = findViewById(R.id.button1)
        recyclerView.adapter = fruitAdaptor
        button1.setOnClickListener {
            val myIntent  = Intent(this, FruitDetailActivity::class.java)
            startActivity(myIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
    }
    private fun fruitsList(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple", R.drawable.ic_apple))
        fruits.add(Fruit("Apricot", R.drawable.ic_apricot))
        fruits.add(Fruit("Avocado", R.drawable.ic_avocado))
        return fruits
    }
}