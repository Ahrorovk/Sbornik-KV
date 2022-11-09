package com.ahrorovk.AhrorovDictionary.Screens.OpenScreen.presentation

import android.annotation.SuppressLint
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ahrorovk.AhrorovDictionary.Screen
import com.ahrorovk.AhrorovDictionary.Screens.OpenScreen.components.CustomOpensCard
import com.ahrorovk.AhrorovDictionary.ui.theme.WHITE
import kotlinx.coroutines.delay
import com.ahrorovk.AhrorovDictionary.R

@Composable
fun SplashScreen(navController: NavController){
    var startAnimate by remember {
        mutableStateOf(false)
    }
    val alphaAnimation= animateFloatAsState(
        targetValue = if(startAnimate) 1f else 0f,
        animationSpec = tween(durationMillis = 3000)
    )
    LaunchedEffect(key1 = true){
        startAnimate=true
        delay(1500)
        navController.navigate(Screen.MAIN_SCREEN){
            popUpTo(Screen.OPEN_SCREEN) {
                inclusive = true
            }
        }

    }
    OpenScreen(alpha = alphaAnimation.value)
}
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun OpenScreen(alpha:Float) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        backgroundColor = WHITE
    ) {
        CustomOpensCard(
            image = R.drawable.logo,
            alpha=alpha
        )
    }
}