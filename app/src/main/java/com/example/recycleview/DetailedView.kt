package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailedView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val tvName: TextView = findViewById(R.id.tvn)
        val tvMobile: TextView = findViewById(R.id.tvm)

        tvName.text = intent.getStringExtra("user_name")
        tvMobile.text = intent.getStringExtra("user_mobile")

    }
}