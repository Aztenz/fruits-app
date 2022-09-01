package com.example.fruits_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruits: List<Fruit>) : RecyclerView.Adapter<FruitAdapter.FruitViewHolder>() {
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

    inner class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val fruitName: TextView
        private val fruitImage: ImageView

        init {
            fruitName = itemView.findViewById(R.id.fruitName)
            fruitImage = itemView.findViewById(R.id.fruitImage)
            fruitImage.setOnClickListener {
                fruits[layoutPosition]
            }
        }

        fun bindFruit(aFruit: Fruit) {
            fruitName.text = aFruit.fruitName
            fruitImage.setImageResource(aFruit.fruitImageModelNumber)
        }
    }
}