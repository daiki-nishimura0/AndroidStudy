package com.example.livedata

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPref = getSharedPreferences("プリファレンス", Context.MODE_PRIVATE)

        val savedText = sharedPref.getString("name", "daiki")

        val editText = findViewById<EditText>(R.id.edit_text)
        editText.setText(savedText)

        val button = findViewById<Button>(R.id.save_button)
        button.setOnClickListener {
            val inputText = editText.text.toString()
            sharedPref.edit().putString("name", inputText).apply()
        }
    }
}