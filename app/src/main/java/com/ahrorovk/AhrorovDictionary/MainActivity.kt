package com.ahrorovk.AhrorovDictionary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.ExperimentalFoundationApi
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel
import com.ahrorovk.AhrorovDictionary.ui.theme.BLUE
import com.ahrorovk.AhrorovDictionary.ui.theme.GymnasiumDictionaryTheme
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
