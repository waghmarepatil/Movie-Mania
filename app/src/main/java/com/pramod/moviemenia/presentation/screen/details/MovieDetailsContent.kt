package com.pramod.moviemenia.presentation.screen.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import coil.size.Scale
import com.pramod.moviemenia.BuildConfig
import com.pramod.moviemenia.presentation.components.RatingComponent
import com.pramod.moviemenia.presentation.components.ReleaseDateComponent
import com.pramod.moviemenia.ui.theme.AppThemeColor
import com.pramod.domain.model.Movie

@Composable
fun MovieDetailsContent(movie: Movie) {
    val scrollState = rememberScrollState()
    Card(
        elevation = 0.dp,
        backgroundColor = MaterialTheme.colors.AppThemeColor
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(scrollState)
        ) {
            Image(
                painter = rememberImagePainter(
                    data = BuildConfig.POSTER_URL + movie.posterPath, builder = {
                        crossfade(true)
                        scale(Scale.FILL)
                    }),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp),
                contentScale = ContentScale.FillWidth
            )
            Column(modifier = Modifier.padding(8.dp)) {
                Spacer(modifier = Modifier.height(16.dp))
//                movie.title?.let {
//                    Text(
//                        text = it,
//                        style = MaterialTheme.typography.h5,
//                        fontWeight = FontWeight.Bold
//                    )
//                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround

                ) {
                    movie.releaseDate?.let {
                        ReleaseDateComponent(releaseDate = it)
                    }
                    movie.rating?.let { RatingComponent(rating = it) }
                }
                Spacer(modifier = Modifier.height(24.dp))

                movie.overview?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.body2
                    )
                }
            }
        }
    }
}