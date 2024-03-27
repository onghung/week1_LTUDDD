package com.example.ltudddfirstproject.tuan1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.ltudddfirstproject.R

class tuan1MainActivity : AppCompatActivity() {
    private lateinit var txt1: EditText
    private lateinit var txt2: EditText
    private lateinit var btn1: Button
    private lateinit var tv1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan1_main)

        txt1 = findViewById(R.id.txtedit1)
        txt2 = findViewById(R.id.txtedit2)
        btn1 = findViewById(R.id.demobtn1)
        tv1 = findViewById(R.id.demotv1)

        btn1.setOnClickListener {
            tinhTong()
        }
    }

    private fun tinhTong() {
        val str1 = txt1.text.toString()
        val nb1 = str1.toFloat()

        val str2 = txt2.text.toString()
        val nb2 = str2.toFloat()

        val tong = nb1 + nb2

        tv1.text = tong.toString()
    }
}
