package com.pramod.moviemenia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.pramod.moviemenia.presentation.navigation.NavGraph
import com.pramod.moviemenia.presentation.screen.home.HomeScreen
import com.pramod.moviemenia.ui.theme.AndroidCleanArchitectureTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidCleanArchitectureTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}

@Preview
@Composable
fun homeScreen(){
    HomeScreen(navController = rememberNavController())
}




