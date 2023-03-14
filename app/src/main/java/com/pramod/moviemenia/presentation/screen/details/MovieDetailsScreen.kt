package com.pramod.moviemenia.presentation.screen.details

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.pramod.moviemenia.ui.theme.AppContentColor
import com.pramod.moviemenia.ui.theme.AppThemeColor


@Composable
fun MovieDetailsScreen(
    movieId: String,
    navController: NavController,
    viewModel: MovieDetailsViewModel = hiltViewModel(),
) {
    viewModel.getMovieDetails(movieID = movieId.toInt())
    val movieDetails by viewModel.selectedMovie.collectAsState()
    Scaffold(
        topBar={
               MovieDetailsTopBar(navController, movieDetails)
        },
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {
            movieDetails?.let { MovieDetailsContent(it) }
        })
}

