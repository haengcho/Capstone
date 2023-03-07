package com.haengcho.capstone

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView

class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item,parent,false)

        return ViewHolder(view)
    }

//    interface ItemClick {
//        fun onClick(view : View, position: Int)
//    }


    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        holder.binditems(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun binditems(item : String){
            val rv_text = itemView.findViewById<TextView>(R.id.rvitem)
            rv_text.text = item
        }


    }
}