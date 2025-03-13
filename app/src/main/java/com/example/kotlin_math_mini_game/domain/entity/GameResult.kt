package com.example.kotlin_math_mini_game.domain.entity

data class GameResult (
    val winner: Boolean,
    val countOfRightAnswers: Int,
    val countOfQuestions: Int,
    val gameSettings: GameSettings
)