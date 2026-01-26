package com.example.lab

import kotlinx.coroutines.*
import kotlin.random.Random

class Dice(private val numSides: Int) {

    suspend fun roll(): Int {
        delay(1000) // giả lập thời gian lăn xúc xắc
        return Random.nextInt(1, numSides + 1)
    }
}

fun main() = runBlocking {
    val dice1 = Dice(6)
    val dice2 = Dice(20)

    println("Rolling dice...")

    val job1 = async { dice1.roll() }
    val job2 = async { dice2.roll() }

    println("Dice 6 sides rolled: ${job1.await()}")
    println("Dice 20 sides rolled: ${job2.await()}")
}
