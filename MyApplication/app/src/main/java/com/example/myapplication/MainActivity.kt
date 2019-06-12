package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Nickname.text
        continueButton.setOnClickListener{
            if(Nickname.text!!.isNotEmpty()){
                var intent=Intent(this, QuestionTypes::class.java)
                    .putExtra("username", Nickname.text.toString())
                startActivity(intent)
            }
            else{
                Toast.makeText(this,"Enter your name please!",Toast.LENGTH_LONG).show()
            }
        }

    }
}
