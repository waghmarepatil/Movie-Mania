package com.pramod.data.repository.dataSourceImpl

import com.pramod.data.db.MovieDao
import com.pramod.data.repository.dataSource.MovieLocalDataSource
import com.pramod.domain.model.Movie
import kotlinx.coroutines.flow.Flow


class MovieLocalDataSourceImpl(private val movieDao: MovieDao) : MovieLocalDataSource {
    override fun getMoviesFromDB(movieId: Int): Flow<Movie> = movieDao.getMovie(movieId)
}