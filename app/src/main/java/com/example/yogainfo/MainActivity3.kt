package com.example.yogainfo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val button1:ImageButton = findViewById(R.id.imageButton1)
        button1.setOnClickListener {
            active2()
        }

        val button2:ImageButton = findViewById(R.id.imageButton2)
        button2.setOnClickListener {
            active3()}

        val button3:ImageButton = findViewById(R.id.imageButton3)
        button3.setOnClickListener {
            active4()}

        val button4:ImageButton = findViewById(R.id.imageButton4)
        button4.setOnClickListener {
            active5()}
    }

    private fun active2() {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    private fun active3() {
        val intent = Intent(this,MainActivity3::class.java)
        startActivity(intent)
    }

    private fun active4() {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)
    }

    private fun active5() {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }
}