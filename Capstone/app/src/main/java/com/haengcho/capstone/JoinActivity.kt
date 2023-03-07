package com.haengcho.capstone

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class JoinActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join)

        val joinBtn = findViewById<Button>(R.id.joinBtn)
        joinBtn.setOnClickListener {
            val intent = Intent(this, JoinMemberShipActivity::class.java)
            startActivity(intent)
        }

        val loginBtn = findViewById<Button>(R.id.loginBtn)
        val idArea = findViewById<EditText>(R.id.idArea)
        val passwordArea = findViewById<EditText>(R.id.passwordArea)

        loginBtn.setOnClickListener {
            if(idArea.text.isEmpty() || passwordArea.text.isEmpty()){
                Toast.makeText(this, "아이디와 비밀번호를 다시 확인해주세요.", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
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