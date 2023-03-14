package com.pramod.moviemenia.presentation.screen.home

import androidx.lifecycle.ViewModel
import com.pramod.domain.useCase.MovieUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    movieUseCases: MovieUseCases,
) : ViewModel() {
    val getAllPopularMovies = movieUseCases.getPopularMoviesUseCase()

}