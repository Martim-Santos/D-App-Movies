package com.example.apicomautenticacao.Adapters

import android.content.Context;
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.apicomautenticacao.R

class ImageAdapter (private val images: List<Image>, private val context: Context) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.image_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val image = images[position]
        holder?.let {
            it.bindView(image)
        }
    }


    override fun getItemCount(): Int {
        return images.size

    }
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindView(image: Image) {
            val title: TextView = itemView.findViewById(R.id.image_item_name)
            val image: ImageView= itemView.findViewById(R.id.ImageView)

        }
    }
}

