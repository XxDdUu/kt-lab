package com.example.lab.Lab01

class Dice2(val numSides: Int) {

    fun roll() {
        val randomNumber = (1..numSides).random()
        println(randomNumber)
    }
}

fun main() {
    val dice = _root_ide_package_.com.example.lab.Lab01.Dice2(6)
    dice.roll()
}
