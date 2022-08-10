package com.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


//Esta activity permite que o usuário role o dado e veja o resultado na tela


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val dice = Dice(6)

        rollButton.setOnClickListener {
            rollDice(dice,findViewById(R.id.dadoUm))
            rollDice(dice,findViewById(R.id.dadoDois))
        }
        dice.roll()

    }

    private fun rollDice(dice: Dice, diceImg:ImageView) {

        val diceRoll = dice.roll()
        val drawableResourse = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        //Atualiza a imagem do dado para o número exibído na tela.
        diceImg.setImageResource(drawableResourse)
        diceImg.contentDescription= diceRoll.toString()

    }
}




