package com.example.fruits_app

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val fruitName: TextView
    private val fruitImage: ImageView

    init {
        fruitName = itemView.findViewById(R.id.fruitName)
        fruitImage = itemView.findViewById(R.id.fruitImage)
    }

    fun bindFruit(aFruit: Fruit) {
        fruitName.text = aFruit.fruitName
        fruitImage.setImageResource(aFruit.fruitImageModelNumber)
    }
}