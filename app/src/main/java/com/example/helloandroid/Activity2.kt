package com.example.helloandroid

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Activity2 : AppCompatActivity() {

    lateinit var btn_back : Button
    lateinit var showimie : TextView
    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        btn_back = findViewById(R.id.btn_back)
        showimie = findViewById(R.id.showimie)
        imageView = findViewById(R.id.imageView)
        imageView.setImageResource(R.drawable.wave)

        if (intent.hasExtra("imie")){
            val imie = intent.getStringExtra("imie")
            showimie.text = "$imie"
        }
        btn_back.setOnClickListener{
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}