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

//        val arr = arrayOf(1, 2, 3, 4)
//        arr.forEach(::hyouji)
        // 匿名関数　ラムダ
//        arr.forEach { println(it) }

        //ラムダ式の中でreturn呼び出すと、ラムダ式ではなく直上の関数を抜けてしまう.この場合onCreateを終わらせている。
//        val arr = arrayOf(1, 2, 3, 4)
//        arr.forEach {
//            if (it == 3) return
//            println(it) // 1 2で終わってしまう
//        }

        val arr2 = arrayOf(1, 2, 3, 4)
        arr2.forEach {
            if (it == 3) return@forEach
            println(it) // 3の時だけラムダ式を終了させている。そのため1 2 4 終了しましたと表示される。
        }
        println("終了しました")
    }
}
