package com.example.cekrek.tugasdua

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val putarButton: Button = findViewById(R.id.btn_putar)
        putarButton.text = "Let's Go"
        putarButton.setOnClickListener {
            kocokDadu()
        }
    }
    private fun kocokDadu (){

        val  randomInt = Random().nextInt(6)+1
        val a = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        val  c : ImageView = findViewById(R.id.dice_image)
        c.setImageResource(a)
    }
}


//    private fun kocokDadu() {
//
//        val randomInt = Random().nextInt(6) + 1
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//        val diceImage : ImageView = findViewById(R.id.dice_image)
//        diceImage.setImageResource(drawableResource)
//
//    }
//}
