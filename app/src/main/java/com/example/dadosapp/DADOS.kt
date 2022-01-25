package com.example.dadosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import java.util.Random
class DADOS : AppCompatActivity() {


    lateinit var imagenes: ImageView
    lateinit var boton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)


        imagenes=findViewById(R.id.imageView)
        boton=findViewById(R.id.botongirar)

        boton.setOnClickListener{

            var porfin = Random()

            var thanks=porfin.nextInt(6)+1
                if (thanks==1){
                    imagenes.setImageResource(R.drawable.uno)
                }
                if (thanks==2){
                    imagenes.setImageResource(R.drawable.dos)
                }
                if (thanks==3){
                    imagenes.setImageResource(R.drawable.tres)
                }
                if (thanks==4){
                    imagenes.setImageResource(R.drawable.cuatro)
                }
                if (thanks==5){
                    imagenes.setImageResource(R.drawable.cinco)
                }
                if (thanks==6){
                    imagenes.setImageResource(R.drawable.seis)
                }
            }

        }



    }





