package com.haengcho.keywordchoice

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class KeyAdapter(val context : Context, val items: ArrayList<KeywordModel>) : RecyclerView.Adapter<KeyAdapter.ViewHolder>() {
    var selectCol = 0
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KeyAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.keyword_items, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: KeyAdapter.ViewHolder, position: Int) {

        val item = items[position]
        val listener = View.OnClickListener { it ->
            Toast.makeText(it.context, "${item.name}를/을 키워드로 선택했습니다.", Toast.LENGTH_SHORT).show()

            if(selectCol == 0) {
                holder.itemView.setBackgroundResource(R.drawable.radius3)
                ++selectCol
            }
            else if(selectCol == 1){
                holder.itemView.setBackgroundResource(R.drawable.radius2)
                --selectCol
            }

        }
        holder.apply {
            bind(listener, item)
            itemView.tag = item
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(listener: View.OnClickListener, item: KeywordModel) {
            val ImageArea = itemView.findViewById<ImageView>(R.id.ImageArea)
            ImageArea.setImageDrawable(item.img)
            ImageArea.setOnClickListener(listener)
            val TextArea = itemView.findViewById<TextView>(R.id.TextArea)
            TextArea.text = item.name
            TextArea.setOnClickListener(listener)



        }
    }
}