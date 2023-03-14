package com.pramod.moviemenia.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun ReleaseDateComponent(releaseDate: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = com.pramod.moviemenia.R.drawable.ic_baseline_date_range_24),
            contentDescription = null,
            modifier = Modifier.padding(
                end = 2.dp,
            ),
            tint = colorResource(id = com.pramod.moviemenia.R.color.rating_color)

        )
        Spacer(modifier = Modifier.padding(start = 4.dp))
        Text(text = releaseDate, style = MaterialTheme.typography.body2)
    }
}