package com.ahrorovk.gymnasiumdictionary

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.GymnasiumDictionaryTheme
import com.ahrorovk.gymnasiumdictionary.ui.theme.LogoBlue
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val systemUiController= rememberSystemUiController()
            systemUiController.setSystemBarsColor(
                color= BLUE,
                darkIcons = false
            )
            GymnasiumDictionaryTheme {
                // A surface container using the 'background' color from the theme
                val viewModel by viewModels<MainViewModel>()
                Navigation(viewModel,this)

            }
        }
    }
}
