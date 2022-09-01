package com.example.fruits_app

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
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
        private val myIntent: Intent = Intent(itemView.context, FruitDetailActivity::class.java)
        init {
            fruitName = itemView.findViewById(R.id.fruitName)
            fruitImage = itemView.findViewById(R.id.fruitImage)
            itemView.setOnClickListener {
                myIntent.putExtra("fruitDescription", "${fruits[layoutPosition].description}")
                startActivity(itemView.context, myIntent, null)
                Log.d("myApp", "${fruits[layoutPosition].fruitName}")
            }
        }

        fun bindFruit(aFruit: Fruit) {
            fruitName.text = aFruit.fruitName
            fruitImage.setImageResource(aFruit.fruitImageModelNumber)
        }
    }
}