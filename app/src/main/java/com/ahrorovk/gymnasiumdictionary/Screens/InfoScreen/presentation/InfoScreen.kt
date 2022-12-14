package com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.gymnasiumdictionary.Constants
import com.ahrorovk.gymnasiumdictionary.Constants.en
import com.ahrorovk.gymnasiumdictionary.Constants.ru
import com.ahrorovk.gymnasiumdictionary.Constants.tjk
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen.components.CustomInfoCard
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.LogoBlue
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE

@Composable
fun InfoScreen(navController: NavController, viewModel: MainViewModel) {
    Scaffold(
        modifier=Modifier.fillMaxSize(),
        backgroundColor = Color.White,
        topBar = {
            TopAppBar(backgroundColor = BLUE) {
                Row(modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(tint = WHITE,painter = painterResource(id = R.drawable.back), contentDescription = null)
                    }
                    Spacer(modifier=Modifier.padding(horizontal = 8.dp))
                    Text(
                        text = if(Constants.tjk) stringResource(id = R.string.aboutTjk)
                        else if (Constants.ru) stringResource(id = R.string.aboutRu)
                        else if(Constants.en) stringResource(id = R.string. aboutEn )
                        else stringResource(id = R.string.aboutTjk),
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

                CustomInfoCard(
                    text = if(Constants.tjk) stringResource(id = R.string.app_name)
                    else if (Constants.ru) stringResource(id = R.string.app_nameRu)
                    else if(Constants.en) stringResource(id = R.string. app_nameEn)
                    else stringResource(id = R.string.app_name),
                    imageOfAuthor =if(tjk) R.drawable.infotjk else if(ru) R.drawable.inforu else if(en) R.drawable.infoen else R.drawable.infotjk,
                    about = "Version 1.0.0",
                    developer = if(Constants.tjk) stringResource(id = R.string.aboutUsTjk)
                    else if (Constants.ru) stringResource(id = R.string.aboutUsRu)
                    else if(Constants.en) stringResource(id = R.string. aboutUsEn)
                    else stringResource(id = R.string.aboutUsTjk),
                    publishedBy = if(Constants.tjk) stringResource(id = R.string.publishedTjk)
                    else if (Constants.ru) stringResource(id = R.string.publishedRu)
                    else if(Constants.en) stringResource(id = R.string. publishedEn)
                    else stringResource(id = R.string.publishedTjk)
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
//                    about = "?????????????? ??????????????????????"
//                )
    }
}