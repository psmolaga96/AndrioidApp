package com.example.helloandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var btn_next : Button
    lateinit var et_imie : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_next = findViewById(R.id.btn_next)
        et_imie = findViewById(R.id.et_imie)
        btn_next.setOnClickListener{
            if(et_imie.text.isNotEmpty()) {
                val imie = et_imie.text.toString()
                val intent = Intent(this, Activity2::class.java)
                intent.putExtra("imie", imie)
                startActivity(intent)
            }
        }
    }
}