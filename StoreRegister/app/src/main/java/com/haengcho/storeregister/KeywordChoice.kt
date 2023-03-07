package com.haengcho.storeregister

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class KeywordChoice : AppCompatActivity() {

    private val list = ArrayList<KeywordModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keyword_choice)

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
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        val builder= AlertDialog.Builder(this)
        builder.setTitle("알림")
        builder.setMessage("키워드 선택을 취소하시겠습니까?")
        builder.setCancelable(false)
        builder.setPositiveButton("확인", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                exit()
            }
        })
        builder.setNegativeButton("뒤로", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {}
        })
        builder.show() // 다이얼로그 보이기
    }

    fun exit() { // 종료
        super.onBackPressed()
    }
}