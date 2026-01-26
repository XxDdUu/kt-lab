package com.example.lab

class Dice(val numSides: Int) {

    fun roll() {
        val randomNumber = (1..numSides).random()
        println(randomNumber)
    }
}

fun main() {
    val dice = Dice(6)
    dice.roll()
}
