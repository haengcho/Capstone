package com.haengcho.keywordchoice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val list = ArrayList<KeywordModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.coffee)!!, "차, 커피"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.nail)!!, "네일아트"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.health)!!, "헬스장"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.store)!!, "편의점, 마트"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.hair)!!, "미용실"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.bathhouse)!!, "목욕탕"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.diningroom)!!, "음식점"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.shirt)!!, "옷가게"))

        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.coffee)!!, "차, 커피"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.nail)!!, "네일아트"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.health)!!, "헬스장"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.store)!!, "편의점, 마트"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.hair)!!, "미용실"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.bathhouse)!!, "목욕탕"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.diningroom)!!, "음식점"))
        list.add(KeywordModel(ContextCompat.getDrawable(this, R.drawable.shirt)!!, "옷가게"))

        val rv = findViewById<RecyclerView>(R.id.listkey)
        val adapter = KeyAdapter(this, list)
        rv.adapter = adapter
        rv.layoutManager = GridLayoutManager(this, 3)


        val saveBtn = findViewById<Button>(R.id.saveBtn)
        saveBtn.setOnClickListener {
            val intent = Intent(this, keywordcheck::class.java)
            startActivity(intent)
        }


    }

}