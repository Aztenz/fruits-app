package com.example.fruits_app

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recycler_view)
        val fruitAdaptor = FruitAdapter(fruitsList())
        recyclerView.adapter = fruitAdaptor
    }
    private fun fruitsList(): List<Fruit> {
        val fruits = mutableListOf<Fruit>()
        fruits.add(Fruit("Apple", R.drawable.ic_apple, "An apple"))
        fruits.add(Fruit("Apricot", R.drawable.ic_apricot, "An Apricot"))
        fruits.add(Fruit("Avocado", R.drawable.ic_avocado, "An Avocado"))
        return fruits
    }
}