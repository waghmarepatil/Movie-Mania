package com.pramod.data.repository.dataSource

import androidx.paging.PagingData
import com.pramod.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRemoteDataSource {
     fun getPopularMovies(): Flow<PagingData<Movie>>
}