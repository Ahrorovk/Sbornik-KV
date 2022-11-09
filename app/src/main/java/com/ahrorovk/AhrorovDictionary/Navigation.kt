package com.ahrorovk.AhrorovDictionary

import android.content.Context
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.AhrorovDictionary.Lists.ListOfCategories
import com.ahrorovk.AhrorovDictionary.Screens.DictionariesScreen.presentation.*
import com.ahrorovk.AhrorovDictionary.Screens.HomeScreen.presentation.HomeScreen
import com.ahrorovk.AhrorovDictionary.Screens.InfoScreen.InfoScreen
import com.ahrorovk.AhrorovDictionary.Screens.MainScreen.presentation.MainScreen
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel
import com.ahrorovk.AhrorovDictionary.Screens.OpenScreen.presentation.SplashScreen
import com.ahrorovk.AhrorovDictionary.Screens.SettingsScreen.presentation.SettingsScreen

@ExperimentalFoundationApi
@Composable
fun Navigation(viewModel: MainViewModel,context:Context) {
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination = Screen.OPEN_SCREEN){
        composable(Screen.OPEN_SCREEN){
            SplashScreen(navController = navController)
        }
        composable(Screen.HOME_SCREEN){
            HomeScreen(navController = navController, viewModel = viewModel)
        }
        composable(Screen.INFO_SCREEN){
            InfoScreen(navController = navController, viewModel = viewModel)
        }

            composable(ListOfCategories.word_1) {
                DictionariesScreen_1(navController = navController, viewModel = viewModel, context = context)
            }
        composable(Screen.MAIN_SCREEN) {
            MainScreen(navController,viewModel)
        }
        composable(Screen.SETTINGS_SCREEN){
            SettingsScreen(navController = navController, viewModel = viewModel)
        }
    }
}