package com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screen
import com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.components.CustomMainButton
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.*

@Composable
fun MainScreen(navController: NavController,viewModel: MainViewModel) {
    Box() {
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_9),
            contentDescription = null
        )
    }
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_8),
            contentDescription = null
        )
    }
    Column {
        Spacer(modifier = Modifier.padding(vertical = 65.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(
                modifier = Modifier
                    .width(123.dp)
                    .height(106.dp),
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null
            )
        }
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_6),
            contentDescription = null
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            CustomMainButton(text = "НАЧАТЬ", textColor = BLACK, buttonColor = Green) {
                navController.navigate(Screen.HOME_SCREEN)
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            CustomMainButton(text = "НАСТРОЙКИ", textColor = WHITE, buttonColor = LogoBlue) {
                navController.navigate(Screen.SETTINGS_SCREEN)
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            CustomMainButton(text = "О ПРИЛОЖЕНИИ", textColor = WHITE, buttonColor = LogoBlue) {
                navController.navigate(Screen.INFO_SCREEN)
            }
        }
        Spacer(modifier = Modifier.padding(10.dp))
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            CustomMainButton(text = "ВЫЙТИ", textColor = WHITE, buttonColor = RED) {
                navController.navigate(Screen.REMOTE_ERROR)
            }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_7),
            contentDescription = null
        )
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_ellipse_5),
            contentDescription = null
        )
    }
}
