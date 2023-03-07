package com.haengcho.storeregister

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myStore = findViewById<Button>(R.id.myStore)

        myStore.setOnClickListener {
            val builder = AlertDialog.Builder(this)
                builder.setTitle("알림")
                builder.setMessage("               등록된 내 매장이 없습니다.\n                        등록하시겠습니까?")
                builder.setCancelable(false)
                fun skipPage() {
                    val intent = Intent(this, StoreRegister::class.java)
                    startActivity(intent)
                }

                builder.setPositiveButton("확인", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface, which: Int) {
                        when(which){
                            DialogInterface.BUTTON_POSITIVE ->
                                skipPage()
                        }
                    }
                    })
                builder.setNegativeButton("뒤로", object : DialogInterface.OnClickListener {
                    override fun onClick(dialog: DialogInterface, which: Int) {
                    }
                    })
            // 다이얼로그를 띄워주기
            builder.show()
        }


    }

    override fun onBackPressed() {   // 뒤로가기 누르면 다이얼로그 생성
        val builder= AlertDialog.Builder(this)
        builder.setTitle("종료하시겠습니까?") // 다이얼로그 제목
        builder.setCancelable(false) // 다이얼로그 화면 밖 터치 방지
        builder.setPositiveButton("나가기", object : DialogInterface.OnClickListener {
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