package com.ahrorovk.gymnasiumdictionary

import android.content.Context
import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ahrorovk.gymnasiumdictionary.Lists.ListOfCategories
import com.ahrorovk.gymnasiumdictionary.Screens.DictionariesScreen.presentation.*
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.presentation.HomeScreen
import com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen.InfoScreen
import com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.presentation.MainScreen
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.Screens.OpenScreen.presentation.OpenScreen
import com.ahrorovk.gymnasiumdictionary.Screens.OpenScreen.presentation.SplashScreen
import com.ahrorovk.gymnasiumdictionary.Screens.SettingsScreen.presentation.SettingsScreen

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