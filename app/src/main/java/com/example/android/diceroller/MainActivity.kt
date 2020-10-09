package com.example.android.diceroller
import java.util.Random
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage = findViewById(R.id.dice_images)
        }
    private fun  rollDice(){
    val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt( 6) + 1
        val drawableResource = when(randomInt){
            1-> R.drawable.dice_1
            2-> R.drawable.dice_2
            3-> R.drawable.dice_3
            4-> R.drawable.dice_4
            5-> R.drawable.dice_5
            6-> R.drawable.dice_6
            else -> R.drawable.dice_6
        }
        //val diceImage : ImageView = findViewById(R.id.dice_images)
        diceImage.setImageResource(drawableResource)
    resultText.text = randomInt.toString()
    }
}
