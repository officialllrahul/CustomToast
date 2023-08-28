package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<Button>(R.id.btn_show_toast)
        val btn1=findViewById<Button>(R.id.btn_show_toast1)
        val btn2=findViewById<Button>(R.id.btn_show_toast2)
        val btn3=findViewById<Button>(R.id.btn_show_toast3)
        val btn4=findViewById<Button>(R.id.btn_show_toast4)

        // apply an onClickListener() method
        btn.setOnClickListener{
            Toast(this).showCustomToast ("Hello! This is a custom Toast1!", this)
        }
        btn1.setOnClickListener{
            Toast(this).showCustomToast1 ("Hello! This is a custom Toast!", this)
        }
        btn2.setOnClickListener{
            Toast(this).showCustomToast2 ("Hello! This is a custom Toast!", this)
        }
        btn3.setOnClickListener{
            Toast(this).showCustomToast3 ("Hello! This is a custom Toast!", this)
        }
        btn4.setOnClickListener{
            Toast(this).showCustomToast4 ("Hello! This is a custom Toast!", this)
        }
    }
}
