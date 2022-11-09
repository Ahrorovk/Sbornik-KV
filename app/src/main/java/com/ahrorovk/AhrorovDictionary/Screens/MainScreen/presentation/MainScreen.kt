package com.ahrorovk.AhrorovDictionary.Screens.MainScreen.presentation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ahrorovk.AhrorovDictionary.Constants
import com.ahrorovk.AhrorovDictionary.Constants.en
import com.ahrorovk.AhrorovDictionary.Constants.ru
import com.ahrorovk.AhrorovDictionary.Constants.tjk
import com.ahrorovk.AhrorovDictionary.MainActivity
import com.ahrorovk.AhrorovDictionary.Screen
import com.ahrorovk.AhrorovDictionary.Screens.MainScreen.components.CustomMainButton
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel
import com.ahrorovk.AhrorovDictionary.ui.theme.*
import com.ahrorovk.AhrorovDictionary.R

@Composable
fun MainScreen(navController: NavController,viewModel: MainViewModel) {
    val gradientOfBlue =
        Brush.horizontalGradient(listOf(Color(0xFF6C92F4), Color(0xFF1A73E9)))
    val gradientOfGreen =
        Brush.horizontalGradient(listOf(Color(0xFF72DFC5), Color(0xFF1DDE7D)))
    val gradientOfRed =
        Brush.horizontalGradient(listOf(Color(0xFFE91A1A), Color(0xFFA62323)))
    var isSortVisible by remember {
        mutableStateOf(false)
    }
    val activity = (LocalContext.current as? MainActivity)
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

    Box(){

    }
        Box(){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 25.dp)
                .padding(end = 12.dp, top = 15.dp), contentAlignment = Alignment.CenterEnd
        ) {
            AnimatedVisibility(visible = isSortVisible) {
                Column(
                    modifier = Modifier
                        .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 3.dp)
                        .background(
                            color = Color(0XFFEBEBEB)
                        )
                ) {
                    Spacer(modifier = Modifier.padding(vertical = 10.dp))
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 5.dp, vertical = 3.dp)
                            .background(Color(0xFFD9D9D9))
                            .width(30.dp)
                            .height(23.dp)
                            .clickable {
                                tjk = true
                                ru = false
                                en = false
                                navController.navigate(Screen.MAIN_SCREEN) {
                                    popUpTo(Screen.MAIN_SCREEN) {
                                        inclusive = true
                                    }
                                }
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "TJK"
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 5.dp, vertical = 3.dp)
                            .background(Color(0xFFD9D9D9))
                            .width(30.dp)
                            .height(23.dp)
                            .clickable {
                                tjk = false
                                ru = true
                                en = false
                                navController.navigate(Screen.MAIN_SCREEN) {
                                    popUpTo(Screen.MAIN_SCREEN) {
                                        inclusive = true
                                    }
                                }
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "RU"
                        )
                    }
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 5.dp, vertical = 3.dp)
                            .background(Color(0xFFD9D9D9))
                            .width(30.dp)
                            .height(23.dp)
                            .clickable {
                                tjk = false
                                ru = false
                                en = true
                                navController.navigate(Screen.MAIN_SCREEN) {
                                    popUpTo(Screen.MAIN_SCREEN) {
                                        inclusive = true
                                    }
                                }
                            },
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center,
                            text = "EN"
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 12.dp, top = 15.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Image(
                modifier = Modifier.padding(end = 5.dp),
                painter = painterResource(id = R.drawable.ic_ellipse_10),
                contentDescription = null
            )
            IconButton(onClick = {
                isSortVisible = !isSortVisible
            }) {
                Icon(
                    painterResource(id = R.drawable.ic_map), contentDescription = null,
                    tint = Color.White,
                )
            }
        }
    }


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 250.dp), contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_ellipse_6),
                contentDescription = null
            )
        }
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 50.dp)
                    .padding(top = 100.dp), contentAlignment = Alignment.Center
            ) {
                Text(
                    textAlign = TextAlign.Center,
                    text = if(Constants.tjk) stringResource(id = R.string.app_name)
                    else if (Constants.ru) stringResource(id = R.string.app_nameRu)
                    else if(Constants.en) stringResource(id = R.string. app_nameEn)
                    else stringResource(id = R.string.app_name),
                    fontSize = 18.sp
                )
            }
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Image(
                    modifier = Modifier
                        .width(123.dp)
                        .height(106.dp),
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null
                )
            }

            Spacer(modifier = Modifier.padding(40.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CustomMainButton(text = if (tjk)
                    stringResource(id = R.string.startTjk)
                else if (ru)
                    stringResource(id = R.string.startRu)
                else if (en)
                    stringResource(id = R.string.startEn)
                else
                    stringResource(id = R.string.startTjk),
                    textColor = BLACK,
                    buttonColor = Green,
                    gradient = gradientOfGreen,
                    onClick = {
                        navController.navigate(Screen.HOME_SCREEN)
                    })

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CustomMainButton(
                    text = if (tjk) stringResource(id = R.string.settingsTjk)
                    else if (ru) stringResource(id = R.string.settingsRu)
                    else if (en) stringResource(id = R.string.settingsEn)
                    else stringResource(id = R.string.settingsTjk),
                    textColor = WHITE,
                    buttonColor = LogoBlue,
                    onClick = {
//                navController.navigate(Screen.SETTINGS_SCREEN)
                    },
                    gradient = gradientOfBlue
                )

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CustomMainButton(text =
                if (tjk) stringResource(id = R.string.aboutTjk)
                else if (ru) stringResource(id = R.string.aboutRu)
                else if (en) stringResource(id = R.string.aboutEn)
                else stringResource(id = R.string.aboutTjk),
                    textColor = WHITE,
                    buttonColor = LogoBlue,
                    gradient = gradientOfBlue, onClick = {
                        navController.navigate(Screen.INFO_SCREEN)
                    })

            }
            Spacer(modifier = Modifier.padding(10.dp))
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                CustomMainButton(text =
                if (tjk) stringResource(id = R.string.goOutTjk)
                else if (ru) stringResource(id = R.string.goOutRu)
                else if (en) stringResource(id = R.string.goOutEn)
                else stringResource(id = R.string.goOutTjk),
                    textColor = WHITE,
                    buttonColor = RED, gradient = gradientOfRed, onClick = {
                        activity?.finish()
                    })
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
