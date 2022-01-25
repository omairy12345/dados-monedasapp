package com.example.dadosapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.*
class MainActivity : AppCompatActivity() {
    lateinit var btn: Button
    lateinit var btn1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.botonmonedas)
        btn1=findViewById(R.id.botondados)


        btn.setOnClickListener {
            val intent =Intent(this, COINS::class.java);
            startActivity(intent)
        }
        btn1.setOnClickListener {
            val intent =Intent(this, DADOS::class.java);
            startActivity(intent)

        }

    }
}