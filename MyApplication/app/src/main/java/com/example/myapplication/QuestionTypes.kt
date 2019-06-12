package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question_types.*

class QuestionTypes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_types)
        BeatboxButton.setOnClickListener(){
            var intent= Intent(this, BeatboxQuestion1::class.java)
            startActivity(intent)
            var a=0
        }
        TechnologiesButton.setOnClickListener {
            var intent = Intent (this, TechnologiesQuestion1::class.java)
            startActivity(intent)
            var b=0
        }
    }
}
