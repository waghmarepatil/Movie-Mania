package com.pramod.domain.useCase

import com.pramod.domain.repository.MovieRepository


class GetMoviesFromDBUseCase(private val movieRepository: MovieRepository) {
    operator fun invoke(movieID: Int) = movieRepository.getMoviesFromDB(movieID)
}