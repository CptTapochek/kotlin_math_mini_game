package com.example.kotlin_math_mini_game.domain.entity

data class Question (
    val sum: Int,
    val visibleNumber: Int,
    val options: List<Int>
)