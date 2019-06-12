package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_result.*
import kotlinx.android.synthetic.main.activity_technologies_question2.*

class TechnologiesQuestion2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_technologies_question2)
        AnswerApple.setOnClickListener {
            var intent= Intent(this, TechnologiesQuestion3::class.java)
            Toast.makeText(this, "Correct!",Toast.LENGTH_LONG).show()
            startActivity(intent)
            var a = Points.text.toString().toInt()
            var b=a+1
            Points.text=b.toString()
            AnswerApple.setBackgroundColor(0x0000FF00)
        }
        AnswerGoogle.setOnClickListener {
            var intent=Intent(this, TechnologiesQuestion3::class.java)
            Toast.makeText(this,"Incorrect!",Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerGoogle.setBackgroundColor(0x00FF0000)
        }
        AnswerXiaomi.setOnClickListener {
            var intent=Intent(this, TechnologiesQuestion3::class.java)
            Toast.makeText(this,"Incorrect!", Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerXiaomi.setBackgroundColor(0x00FF0000)
        }
        AnswerNokia.setOnClickListener {
            var intent=Intent(this, TechnologiesQuestion3::class.java)
            Toast.makeText(this,"Incorrect!",Toast.LENGTH_LONG).show()
            startActivity(intent)
            AnswerNokia.setBackgroundColor(0x00FF0000)
        }
    }
}
