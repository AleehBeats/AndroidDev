package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.floor

var count=0
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        One.setOnClickListener(){
            var s: String = LineText.text.toString()+"1";
            LineText.setText(s)

        }
        Two.setOnClickListener(){
            var s:String =LineText.text.toString()+"2"
            LineText.setText(s)
        }
        Three.setOnClickListener(){
            var s:String=LineText.text.toString()+"3"
            LineText.setText(s)
        }
        Four.setOnClickListener(){
            var s:String=LineText.text.toString()+"4"
            LineText.setText(s)
        }
        Five.setOnClickListener(){
            var s:String=LineText.text.toString()+"5"
            LineText.setText(s)
        }
        Six.setOnClickListener(){
            var s:String=LineText.text.toString()+"6"
            LineText.setText(s)
        }
        Seven.setOnClickListener(){
            var s:String=LineText.text.toString()+"7"
            LineText.setText(s)
        }
        Eight.setOnClickListener(){
            var s:String=LineText.text.toString()+"8"
            LineText.setText(s)
        }
        Nine.setOnClickListener(){
            var s:String=LineText.text.toString()+"9"
            LineText.setText("9")
        }
        Zero.setOnClickListener(){
            var s:String=LineText.text.toString()+"0"
            LineText.setText(s)
        }

        Plus.setOnClickListener(){
            var a=LineText.text
            LineText.setText("")
            SaveText.setText(a)
            count =1
        }
        Minus.setOnClickListener(){
            var a=LineText.text
            LineText.setText("")
            SaveText.setText(a.toString())
            count =2
        }
        Multiple.setOnClickListener(){
            var a=LineText.text
            LineText.setText("")
            SaveText.setText(a.toString())
            count =3
        }
        Divide.setOnClickListener(){
            var a=LineText.text
            LineText.setText("")
            SaveText.setText(a.toString())
            count =4
        }
        Clear.setOnClickListener(){
            LineText.setText("")
            SaveText.setText("")
        }
        Equation.setOnClickListener(){
            calculate()
            LineText.setText("")
        }


    }
     public fun calculate () {

        var b:Float =  LineText.text.toString().toFloat();
        var c:Float = SaveText.text.toString().toFloat()
         var a:Float
         if(count==1)
         {
             a=b+c
             SaveText.setText(a.toString())

         }
         if(count==2)
         {
             a=c-b
             SaveText.setText(a.toString())

         }
         if(count==3)
         {
             a=b*c
             SaveText.setText(a.toString())

         }
         if(count==4)
         {
             a=c/b
             SaveText.setText(a.toString())

         }


    }


}



}
