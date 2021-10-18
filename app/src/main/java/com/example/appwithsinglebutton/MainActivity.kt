package com.example.appwithsinglebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var textView: TextView
    lateinit var input: EditText
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.tvText)
        input = findViewById(R.id.edText)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            if(input.text.isNotEmpty()){
                textView.text = input.text
            }else{
                Toast.makeText(this, "Type first", Toast.LENGTH_LONG).show()
            }
        }
    }
}