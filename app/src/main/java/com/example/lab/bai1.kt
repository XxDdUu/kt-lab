package com.example.lab

class Dice {
    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}

fun main() {
    val dice = Dice()
    dice.roll()
}
