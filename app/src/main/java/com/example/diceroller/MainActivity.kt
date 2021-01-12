package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.btnRoll)


        rollButton.setOnClickListener {

            rollButton.setText("Dice Rolled!")
            rollDice()
            rollDice2()
            //delay the change of button
            Handler().postDelayed({
                //doSomethingHere()
                rollButton.setText(" Roll Again")
            }, 900)


        }
    }
    class Dice(val numSides: Int) {

        fun roll(): Int {
            return (1..numSides).random()
        }
    }
//Roll the first dice and update the screen with the result.
    private fun rollDice() {
    // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
    // Update the screen with the dice roll
        val DiceOne: TextView = findViewById(R.id.dice1)
    DiceOne.text = diceRoll.toString()
    }

    //Roll the second dice and update the screen with the result.
    private fun rollDice2() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val DiceTwo: TextView = findViewById(R.id.dice2)
        DiceTwo.text = diceRoll.toString()
    }
}