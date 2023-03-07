package com.haengcho.storeregister

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class StoreRegister : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store_register)

        val BusinessBtn = findViewById<Button>(R.id.BusinessBtn)
        BusinessBtn.setOnClickListener {
            val intent = Intent(this, BusinessRegister::class.java)
            startActivity(intent)
        }

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        nextBtn.setOnClickListener {
            val intent = Intent(this, KeywordChoice::class.java)
            startActivity(intent)
        }
    }

    override fun onBackPressed() {
        val builder= AlertDialog.Builder(this)
        builder.setTitle("알림")
        builder.setMessage("매장 등록을 취소하시겠습니까?")
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