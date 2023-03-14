package com.pramod.moviemenia.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.pramod.moviemenia.R

val Roboto = FontFamily(
    Font(R.font.roboto),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

val SourceSans = FontFamily(
    Font(R.font.sourcesans),
    Font(R.font.sourcesansbold, FontWeight.Bold)
)

val DejaVuSans = FontFamily(
    Font(R.font.dejavusans),
    Font(R.font.dejavusans_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily= DejaVuSans,
    body1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp,
        letterSpacing = 0.15.sp,
    ),


    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)