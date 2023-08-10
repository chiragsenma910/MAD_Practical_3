package com.example.pra3_106_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val intent = intent
        var bundle:String?=intent.getStringExtra("MainActivity1")
        textView=findViewById(R.id.textview2)
        textView.text=bundle



    }

}