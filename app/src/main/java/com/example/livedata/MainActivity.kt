package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun allSum(vararg values: Int): Int {
            var result = 0
            for (value in values) {
                result += value
            }
            return result
        }
        println(allSum(1, 2, 4, 6, 7))

        fun allSum2(vararg values: Int): Int {
            var result = 0
            for (value in values) {
                result += value
            }
            return result
        }

        var arr = intArrayOf(2, 4, 6, 8)
        //スプレッド演算子を使うことで配列を可変長引数として渡せる
        println(allSum2(*arr))

    }
}