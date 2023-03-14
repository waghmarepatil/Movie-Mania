package com.pramod.data.repository

import com.pramod.data.repository.dataSource.MovieLocalDataSource
import com.pramod.data.repository.dataSource.MovieRemoteDataSource
import com.pramod.domain.model.Movie
import com.pramod.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow

class MovieRepositoryImpl(
    private val movieRemoteDataSource: MovieRemoteDataSource,
    private val movieLocalDataSource: MovieLocalDataSource,
) :
    MovieRepository {
    override fun getPopularMovies() =
        movieRemoteDataSource.getPopularMovies()

    override fun getMoviesFromDB(movieId: Int): Flow<Movie> =
        movieLocalDataSource.getMoviesFromDB(movieId)
}