package com.example.kotlin_math_mini_game.domain.repository

import com.example.kotlin_math_mini_game.domain.entity.GameSettings
import com.example.kotlin_math_mini_game.domain.entity.Level
import com.example.kotlin_math_mini_game.domain.entity.Question


interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ) : Question

    fun getGameSettings(level: Level): GameSettings
    
}