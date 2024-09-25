package com.lemieux.movielist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lemieux.movielist.feature.list.MovieListScreen
import com.lemieux.movielist.ui.theme.MovieListTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MovieListTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MovieListScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}