package com.tanvi.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
/**
 * 1. create recycler addapter
 * */
class RvAdapter(val list: List<Int>) : RecyclerView.Adapter<RvAdapter.MyViewHolder>(){

    class MyViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
     val textView = itemView.findViewById<TextView>(R.id.textView)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.item_row,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = list[position].toString()
    }

    override fun getItemCount(): Int {
       return list.size
    }
}


