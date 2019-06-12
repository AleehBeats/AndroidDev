package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_beatbox_question3.*
import kotlinx.android.synthetic.main.activity_result.*

class BeatboxQuestion3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beatbox_question3)
        AnswerMoonlight.setOnClickListener {
            var intent = Intent(this , Result::class.java)
            Toast.makeText(this,"No, bro he was a judge", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerMoonlight.setBackgroundColor(0x00FF0000)
        }
        AnswerAleeh.setOnClickListener {
            var intent=Intent(this, Result::class.java)
            Toast.makeText(this, "No, bro I got 3rd place", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerAleeh.setBackgroundColor(0x00FF0000)
        }
        AnswerDropical.setOnClickListener {
            var intent= Intent(this, Result::class.java)
            Toast.makeText(this, "No, bto he didn't come", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerDropical.setBackgroundColor(0x00FF0000)
        }
        AnswerTsay.setOnClickListener {
            var intent= Intent(this, Result::class.java)
            Toast.makeText(this,"Yes, it is correct", Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            AnswerTsay.setBackgroundColor(0x0000FF00)
        }
    }
}
