package com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen.components.CustomInfoCard
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.LogoBlue
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE

@Composable
fun InfoScreen(navController: NavController, viewModel: MainViewModel) {
    Scaffold(
        topBar = {
            TopAppBar(backgroundColor = BLUE) {
                Row(modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(tint = WHITE,painter = painterResource(id = R.drawable.back), contentDescription = null)
                    }
                    Spacer(modifier=Modifier.padding(horizontal = 8.dp))
                    Text(
                        text = "О ПРИЛОЖЕНИИ",
                        color = WHITE,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                    )
                }
            }
        }
    ) {
        LazyColumn() {
            item {
                CustomInfoCard(
                    text = "Луғати вожаҳои серистеъмоли забонҳои тоҷикӣ, русӣ ва англисӣ",
                    imageOfAuthor = R.drawable.vocabulary,
                    about = "Version 1.0.0",
                    developer = ""
                    )
//                CustomInfoCard(
//                    text = "Ahrorov Karomatullokhon Firdavsovich",
//                    developer="Android-developer",
//                    imageOfAuthor = R.img,
//                    about = "Best programmer and founder of this app"
//                )
//                CustomInfoCard(
//                    text = "Karimov Dilshod Munirjonovich",
//                    developer="Back-End developer",
//                    imageOfAuthor = R.drawable.ic_launcher_background,
//                    about = "Хороший программист"
//                )
            }
        }
    }
}