package com.plcoding.composepaging3caching

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.collectAsLazyPagingItems
import com.plcoding.composepaging3caching.presentation.BeerScreen
import com.plcoding.composepaging3caching.presentation.BeerViewModel
import com.plcoding.composepaging3caching.ui.theme.ComposePaging3CachingTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
//        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            ComposePaging3CachingTheme {
                // A surface container using the 'background' color from the theme

                Scaffold(
                    topBar = {
                        TopAppBar(title = {
                            Text(
                                text = "Punk API"
                            )
                        },
                            backgroundColor = MaterialTheme.colors.background)
                    }
                ) {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ) {
                        val viewModel = hiltViewModel<BeerViewModel>()
                        val beers = viewModel.beerPagingFlow.collectAsLazyPagingItems()
                        BeerScreen(beers = beers)
                    }
                }
            }
        }
    }
}