package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_beatbox_question2.*
import kotlinx.android.synthetic.main.activity_result.*

class BeatboxQuestion2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beatbox_question2)

        AnswerBeeLow.setOnClickListener {
            var intent = Intent(this, BeatboxQuestion3::class.java)
            Toast.makeText(this, "No bro, it is incorrect", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerBeeLow.setBackgroundColor(0x00FF0000)
        }
        AnswerKenny.setOnClickListener {
            var intent =Intent(this, BeatboxQuestion3::class.java)
            Toast.makeText(this, "Yes bro, it is correct", Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            AnswerKenny.setBackgroundColor(0x0000FF00)
        }
        AnswerRahzel.setOnClickListener {
            var intent = Intent(this,BeatboxQuestion3::class.java)
            Toast.makeText(this, "No bro, it is incorrect", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerRahzel.setBackgroundColor(0x00FF0000)
        }
        AnswerScratch.setOnClickListener {
            var intent= Intent(this,BeatboxQuestion3::class.java)
            Toast.makeText(this, " No bro, it is incorrect", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerScratch.setBackgroundColor(0x00FF0000)
        }

    }
}
