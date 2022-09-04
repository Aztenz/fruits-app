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
        fruits.add(Fruit("Apple", R.drawable.ic_apple, getString(R.string.appleDescription), R.drawable.bg_apple))
        fruits.add(Fruit("Apricot", R.drawable.ic_apricot, "An Apricot", R.drawable.bg_apricots))
        fruits.add(Fruit("Avocado", R.drawable.ic_avocado, "An Avocado", R.drawable.bg_avocado))
        fruits.add(Fruit("Banana", R.drawable.ic_banana, "An Avocado", R.drawable.bg_banana))
        fruits.add(Fruit("Blue Berry", R.drawable.ic_blue_berry, "An Avocado", R.drawable.bg_blueberry))
        fruits.add(Fruit("Cherry", R.drawable.ic_cherry, "An Avocado", R.drawable.bg_cherry))
        fruits.add(Fruit("Dragon Fruit", R.drawable.ic_dragon_fruit, "An Avocado", R.drawable.bg_dragonfruit))
        fruits.add(Fruit("Fig", R.drawable.ic_fig, "An Avocado", R.drawable.bg_fig))
        fruits.add(Fruit("Goji Berry", R.drawable.ic_goji_berry, "An Avocado", R.drawable.bg_gojiberry))
        fruits.add(Fruit("Grapes", R.drawable.ic_grapes, "An Avocado", R.drawable.bg_grape))
        fruits.add(Fruit("Kiwi", R.drawable.ic_kiwi, "An Avocado", R.drawable.bg_kiwi))
        fruits.add(Fruit("Mango", R.drawable.ic_mango, "An Avocado", R.drawable.bg_mango))
        fruits.add(Fruit("Melon", R.drawable.ic_melon, "An Avocado", R.drawable.bg_melon))
        fruits.add(Fruit("Watermelon", R.drawable.ic_watermelon, "An Avocado", R.drawable.bg_watermelon))
        return fruits
    }
}