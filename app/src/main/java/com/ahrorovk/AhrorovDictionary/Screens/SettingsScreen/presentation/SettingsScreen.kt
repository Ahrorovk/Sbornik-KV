package com.ahrorovk.AhrorovDictionary.Screens.SettingsScreen.presentation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel

@Composable
fun SettingsScreen(navController: NavController,viewModel: MainViewModel){
    Text("Эта Страница на стадии разработки", fontSize = 30.sp)
}