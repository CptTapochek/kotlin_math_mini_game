package com.example.kotlin_math_mini_game.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightAnswers: Int,
    val gameTimeInSeconds: Int
)