package com.example.lab.Lab01

import kotlinx.coroutines.*
import kotlin.random.Random

class Dice4(private val numSides: Int) {

    suspend fun roll(): Int {
        delay(1000) // giả lập thời gian lăn xúc xắc
        return Random.nextInt(1, numSides + 1)
    }
}

fun main() = runBlocking {
    val dice1 = _root_ide_package_.com.example.lab.Lab01.Dice4(6)
    val dice2 = _root_ide_package_.com.example.lab.Lab01.Dice4(20)

    println("Rolling dice...")

    val job1 = async { dice1.roll() }
    val job2 = async { dice2.roll() }

    println("Dice 6 sides rolled: ${job1.await()}")
    println("Dice 20 sides rolled: ${job2.await()}")
}
