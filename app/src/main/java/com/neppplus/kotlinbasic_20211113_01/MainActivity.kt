package com.neppplus.kotlinbasic_20211113_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {

//      내부의 코드는 로그찍 버큰을 누를대 마다 실행됨
            Log.d("메인화면","로그 찍기 버튼 누름")
            Log.e("메인화면", "e 로 로그 찍어보기")
            Log.i("메인화면", "i 로 로그 찍어보기")



        }
    }


}