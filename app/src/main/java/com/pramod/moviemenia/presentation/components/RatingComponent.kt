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
import com.pramod.moviemenia.R

@Composable
fun RatingComponent(rating: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_baseline_star_rate),
            contentDescription = null,
            modifier = Modifier
                .padding(
                    end = 2.dp,
                ),
            tint = colorResource(id = R.color.rating_color)
        )
        Spacer(modifier = Modifier.padding(start = 4.dp))

        Text(text = rating, style = MaterialTheme.typography.body2)
    }
}