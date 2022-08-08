package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 高階関数
        fun hyouji(n: Int) {
            println(n)
        }

        val arr = arrayOf(1, 2, 3, 4)
//        arr.forEach(::hyouji)
        // 匿名関数　ラムダ
        arr.forEach { println(it) }
    }
}