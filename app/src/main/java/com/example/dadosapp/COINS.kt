package com.example.dadosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.Random

class COINS : AppCompatActivity() {

    lateinit var imagenen: ImageView
    lateinit var botones: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coins)


        imagenen =findViewById(R.id.ladomonedas)
        botones=findViewById(R.id.lanzarmonedas)

        botones.setOnClickListener{

            var correya = Random()

            var please =correya.nextInt(6)+1

                if (please==1){
                    imagenen.setImageResource(R.drawable.cara)
                }
                if (please==2){
                    imagenen.setImageResource(R.drawable.cruz)
                }

            }

        }


    }

