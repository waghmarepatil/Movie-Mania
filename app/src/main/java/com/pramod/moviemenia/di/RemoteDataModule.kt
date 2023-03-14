package com.pramod.moviemenia.di

import com.pramod.data.api.MovieApi
import com.pramod.data.db.MovieDB
import com.pramod.data.repository.dataSource.MovieRemoteDataSource
import com.pramod.data.repository.dataSourceImpl.MovieRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RemoteDataModule {
    @Provides
    fun provideMoviesRemoteDataSource(movieApi: MovieApi, movieDB: MovieDB) : MovieRemoteDataSource =
        MovieRemoteDataSourceImpl(movieApi, movieDB = movieDB)
}