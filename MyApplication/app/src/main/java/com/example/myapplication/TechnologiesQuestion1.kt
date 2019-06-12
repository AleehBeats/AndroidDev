package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_technologies_question1.*

class TechnologiesQuestion1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies_question1)
        Answer855.setOnClickListener {
            var intent = Intent(this, TechnologiesQuestion2::class.java)
            Toast.makeText(this, "Yeah, correct", Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            Answer855.setBackgroundColor(0x0000FF00)
        }
        Answer835.setOnClickListener {
            var intent = Intent(this,TechnologiesQuestion2::class.java)
            Toast.makeText(this, " No, incorrect", Toast.LENGTH_LONG).show()
            startActivity(intent)
            Answer835.setBackgroundColor(0x00FF0000)
        }
        Answer845.setOnClickListener {
            var intent = Intent(this, TechnologiesQuestion2::class.java)
            Toast.makeText(this, "No, incorrect", Toast.LENGTH_LONG).show()
            startActivity(intent)
            Answer845.setBackgroundColor(0x00FF0000)
        }
        Answer865.setOnClickListener {
            var intent=Intent(this, TechnologiesQuestion2::class.java)
            Toast.makeText(this,"This model doesn't exist", Toast.LENGTH_LONG).show()
            startActivity(intent)
            Answer865.setBackgroundColor(0x00FF0000)
        }
    }
}
