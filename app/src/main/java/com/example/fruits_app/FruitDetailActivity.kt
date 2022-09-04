package com.example.fruits_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import com.google.android.material.appbar.CollapsingToolbarLayout

class FruitDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
        val myText: TextView = findViewById(R.id.description_label)
        val myToolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        val myImage: ImageView = findViewById(R.id.fruitDetailImage)
        val myBackground: ImageView = findViewById(R.id.fruitBackgroundImage)
        myBackground.setImageResource(intent.getIntExtra("fruitBackground", -1))
        myImage.setImageResource(intent.getIntExtra("fruitImage", -1))
        myToolbar.title = intent.getStringExtra("fruitName")
        myText.text = intent.getStringExtra("fruitDescription")
    }
}