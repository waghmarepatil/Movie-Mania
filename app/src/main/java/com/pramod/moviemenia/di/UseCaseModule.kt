package com.pramod.moviemenia.di

import com.pramod.domain.repository.MovieRepository
import com.pramod.domain.useCase.GetMoviesFromDBUseCase
import com.pramod.domain.useCase.GetPopularMoviesUseCase
import com.pramod.domain.useCase.MovieUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideMovieUseCases(movieRepository: MovieRepository) = MovieUseCases(
        getPopularMoviesUseCase = GetPopularMoviesUseCase(movieRepository = movieRepository),
        getMoviesFromDBUseCase = GetMoviesFromDBUseCase(movieRepository = movieRepository)
    )
}