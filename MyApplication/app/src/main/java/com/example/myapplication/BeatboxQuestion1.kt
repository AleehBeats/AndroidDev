package com.example.myapplication

import android.content.Intent
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_beatbox_question1.*
import kotlinx.android.synthetic.main.activity_result.*

class BeatboxQuestion1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beatbox_question1)

        AnswerAlem.setOnClickListener(){
            var intent= Intent(this, BeatboxQuestion2::class.java)
            Toast.makeText(this, "Correct!", Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            AnswerAlem.setBackgroundColor(0x0000FF00)
        }
        AnswerAlexinho.setOnClickListener {
            var intent1=Intent(this,BeatboxQuestion2::class.java)
            Toast.makeText(this, "Incorrect, he is 2018 year champion!", Toast.LENGTH_LONG).show()
            startActivity(intent1)
            AnswerAlexinho.setBackgroundColor(0x00FF0000)
        }
        AnswerSkiller.setOnClickListener {
            var intent2=Intent(this, BeatboxQuestion2::class.java)
            Toast.makeText(this, "Incorrect, he is 2012 year world champion!", Toast.LENGTH_LONG).show()
            startActivity(intent2)
            AnswerSkiller.setBackgroundColor(0x00FF0000)
        }
        AnswerZede.setOnClickListener {
            var intent3 =Intent(this, BeatboxQuestion2::class.java)
            Toast.makeText(this, "Incorrect, he is 2009 year world champion", Toast. LENGTH_LONG).show()
            startActivity(intent3)
            AnswerZede.setBackgroundColor(0x00FF0000)
        }


    }
}
