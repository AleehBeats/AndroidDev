package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        Reset.setOnClickListener {
            var intent= Intent(this, MainActivity::class.java)
            Toast.makeText(this, "Game was reset", Toast.LENGTH_LONG).show()
            startActivity(intent)
            var b=0
            Points.text=b.toString()
        }
    }
}
