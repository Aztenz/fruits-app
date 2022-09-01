package com.example.fruits_app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruits: List<Fruit>) : RecyclerView.Adapter<FruitViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        return FruitViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        holder.bindFruit(fruits[position])
    }

    override fun getItemCount(): Int {
        return fruits.size
    }

}