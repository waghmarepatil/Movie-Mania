package com.pramod.moviemenia.di

import com.pramod.data.repository.MovieRepositoryImpl
import com.pramod.data.repository.dataSource.MovieLocalDataSource
import com.pramod.data.repository.dataSource.MovieRemoteDataSource
import com.pramod.domain.repository.MovieRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideMoviesRepository(
        movieRemoteDataSource: MovieRemoteDataSource,
        movieLocalDataSource: MovieLocalDataSource
    ): MovieRepository =
        MovieRepositoryImpl(movieRemoteDataSource, movieLocalDataSource = movieLocalDataSource)
}