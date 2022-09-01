package com.example.fruits_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class FruitDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_detail)
        setSupportActionBar(findViewById(R.id.toolbar))
        val myText: TextView = findViewById(R.id.description_label)
        Log.d("myApp", "${intent.getStringExtra("fruitDescription")}")
        myText.text = intent.getStringExtra("fruitDescription")
    }
}