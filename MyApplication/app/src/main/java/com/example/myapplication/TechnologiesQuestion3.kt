package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_technologies_question3.*

class TechnologiesQuestion3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies_question3)
        AnswerAlikhan.setOnClickListener {
            var intent = Intent(this, Result::class.java)
            Toast.makeText(this, "Really? You have chosen this answer?", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerAlikhan.setBackgroundColor(0x00FF0000)
        }
        AnswerTim.setOnClickListener {
            var intent = Intent(this, Result:: class.java)
            Toast.makeText(this, "Incorrect!", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerTim.setBackgroundColor(0x00FF0000)
        }
        AnswerSteve.setOnClickListener {
            var intent= Intent(this, Result:: class.java)
            Toast.makeText(this, "Correct!",Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            AnswerSteve.setBackgroundColor(0x0000FF00)
        }
        AnswerSudar.setOnClickListener {
            var intent = Intent (this, Result::class.java)
            Toast.makeText(this,"Incorrect!", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerSudar.setBackgroundColor(0x00FF0000)
        }
    }
}
