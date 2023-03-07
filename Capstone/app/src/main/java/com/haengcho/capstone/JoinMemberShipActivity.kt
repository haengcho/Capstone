package com.haengcho.capstone

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class JoinMemberShipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_join_member_ship)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val checkArea = findViewById<CheckBox>(R.id.checkArea)

        //임시
        nextBtn.setOnClickListener {
            if(checkArea.isChecked == true){
                val intent = Intent(this, KeywordActivity::class.java)
                startActivity(intent)
            }
            else if(checkArea.isChecked == false){
                Toast.makeText(this,"약관에 동의해 주세요.",Toast.LENGTH_LONG).show()
            }

        }


    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("회원가입을 취소하시겠습니까?")
        builder.setCancelable(false)
        builder.setPositiveButton("확인", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                exit()
            }
        })
        builder.setNegativeButton("뒤로", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {}
        })
        builder.show()
    }

    fun exit() { // 종료
        super.onBackPressed()
    }
}