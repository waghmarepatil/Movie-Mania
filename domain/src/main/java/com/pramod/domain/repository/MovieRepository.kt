package com.pramod.domain.repository

import androidx.paging.PagingData
import com.pramod.domain.model.Movie
import kotlinx.coroutines.flow.Flow


interface MovieRepository {
    fun getPopularMovies(): Flow<PagingData<Movie>>
    fun getMoviesFromDB(movieId: Int): Flow<Movie>
}