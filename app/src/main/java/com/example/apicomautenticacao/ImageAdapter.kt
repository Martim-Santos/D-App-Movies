package com.example.apicomautenticacao

import android.content.Context;
import android.media.Image
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.recyclerview.widget.RecyclerView

class ImageAdapter (private val images: List<Image>, private val context: Context) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ImageAdapter.ViewHolder, position: Int) {
        val image = images[position]
        holder?.let {
            it.bindView(image)
        }
    }


    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}