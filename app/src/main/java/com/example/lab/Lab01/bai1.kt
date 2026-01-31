package com.example.lab.Lab01

class Dice1 {
    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}

fun main() {
    val dice = _root_ide_package_.com.example.lab.Lab01.Dice1()
    dice.roll()
}
