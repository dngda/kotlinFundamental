package com.airmineral.latihankotlincodelabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dice_roller.*
import java.util.*

class DiceRollerActivity : AppCompatActivity() {
    private var dice1 = 0
    private var dice2 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice_roller)
        tv_result.text = getString(R.string.tv_result, dice1+dice2)

        btn_roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        dice1 = Random().nextInt(6) + 1
        dice2 = Random().nextInt(6) + 1
        tv_result.text = getString(R.string.tv_result, dice1+dice2)

        dice_image1.setImageResource(getRandomDiceImage(dice1))
        dice_image2.setImageResource(getRandomDiceImage(dice2))
    }

    private fun getRandomDiceImage(dice : Int) : Int {
        return when (dice) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
}

