package com.diceroller

class Dice(private val numSides: Int) {

    //Rola o dado de 1 ao número de lados do dado.
    fun roll(): Int {
        return (1..numSides).random()
    }

}