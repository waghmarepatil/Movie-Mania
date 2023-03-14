package com.pramod.domain.useCase


data class MovieUseCases(
    val getPopularMoviesUseCase: GetPopularMoviesUseCase,
    val getMoviesFromDBUseCase: GetMoviesFromDBUseCase,
)
