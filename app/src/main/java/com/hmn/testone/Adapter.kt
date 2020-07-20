package com.hmn.testone

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class Adapter(val context: Context,val list: List<Model>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val image = view.findViewById<ImageView>(R.id.iv_test)
        val name = view.findViewById<TextView>(R.id.tv_name)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.image_item,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.name.text = list[position].nam
        Picasso.get().load(list[position].image).into(holder.image)
    }
}