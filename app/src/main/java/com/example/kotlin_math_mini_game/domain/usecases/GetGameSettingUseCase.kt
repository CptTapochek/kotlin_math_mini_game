package com.example.kotlin_math_mini_game.domain.usecases

import com.example.kotlin_math_mini_game.domain.entity.GameSettings
import com.example.kotlin_math_mini_game.domain.entity.Level
import com.example.kotlin_math_mini_game.domain.repository.GameRepository

class GetGameSettingUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level) : GameSettings {
        return repository.getGameSettings(level)
    }
}