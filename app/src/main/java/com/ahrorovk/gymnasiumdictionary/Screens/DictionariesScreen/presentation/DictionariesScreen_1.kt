package com.ahrorovk.gymnasiumdictionary.Screens.DictionariesScreen.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components.CustomDictionariesWordsBox
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components.HomeScreenTopAppBar
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.Green
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE
import kotlinx.coroutines.*

@SuppressLint("UnrememberedMutableState")
@Composable
fun DictionariesScreen_1(navController: NavController, viewModel:MainViewModel, context: Context) {
    val searchTextField = viewModel.searchTextField
    val listOfTjkWords = viewModel.listOfTjkWords
    val listOfRuWords = viewModel.listOfRuWords
    val listOfEnWords = viewModel.listOfEnWords
//    val listOfEnTranscription = viewModel.listOfEnTranscription
    val listOfAudio = viewModel.listOfAudio
    val bottom = listOf(1)
//    var list = listOf(0,10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270,280,290,300)
    val category = viewModel.category
//    var j by mutableStateOf(0)
    for(i in 0 until 30) {
        if (category == viewModel.listOfCategory[i]) {
            Scaffold(
                topBar = {
                    HomeScreenTopAppBar(
                        backIcon = R.drawable.back,
                        searchIcon = R.drawable.ic_search,
                        category = category,
                        value = searchTextField,
                        viewModel = viewModel,
                        backgroundColor = BLUE,
                        iconButtonOnClick = {
                            viewModel.setSearch("")
                        },
                        bool = 1,
                        backToHomeIconButtonOnClick = { navController.popBackStack() },
                        backToMainIconButtonOnClick = {})
                }, bottomBar = {
                    BottomNavigation(
                        backgroundColor = BLUE,
                        contentColor = White
                    ) {
                        bottom.forEach { index ->
                            if(i!=0) {
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = {
                                        viewModel.setCategories(viewModel.listOfCategory[i - 1])
                                    },
                                    label = {
                                    },
                                    icon = {
                                        Icon(
                                            imageVector = Icons.Default.ArrowBackIos,
                                            contentDescription = null
                                        )
                                    },
                                    selectedContentColor = WHITE,
                                    unselectedContentColor = WHITE
                                )
                            }
                            if(i!=29) {
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = {
                                        viewModel.setCategories(viewModel.listOfCategory[i + 1])
                                    },
                                    label = {
                                    },
                                    icon = {
                                        Icon(
                                            imageVector = Icons.Default.ArrowForwardIos,
                                            contentDescription = null
                                        )
                                    },
                                    selectedContentColor = WHITE,
                                    unselectedContentColor = WHITE
                                )
                            }
                        }
                    }
                }
            ) {

//        val mp3: MediaPlayer = MediaPlayer.create(context, listOfAudio[index.value])
                    LazyColumn() {
                        items(listOfTjkWords[i].size){index->
                            Log.e("INDEX"," is -> $index")
                            var mp3Get by remember { mutableStateOf(false) }

                            if (searchTextField == listOfTjkWords[i][index]) {
                                    CustomDictionariesWordsBox(
                                        tjk = listOfTjkWords[i][index],
                                        ru = listOfRuWords[i][index],
                                        en = listOfEnWords[i][index],
                                        viewModel = viewModel,
                                        mp3Start = {
                                            val mp3: MediaPlayer =
                                                MediaPlayer.create(context, listOfAudio[i][index])
                                            mp3Get = !mp3Get
                                            if (mp3Get) {
                                                mp3.start()
                                                CoroutineScope(Dispatchers.Default + Job()).launch {
                                                    Log.e("Context", "job 1 -> ${Job()}")
                                                    delay(1500)
                                                    mp3Get = !mp3Get
                                                }
                                            } else if (!mp3Get) {
                                                mp3.stop()
                                            }
                                            viewModel.col.value = Green
                                        },
                                        mp3Get = mp3Get,
                                        letter = category, context = context
                                    )
                                } else if (searchTextField == "") {
                                    CustomDictionariesWordsBox(
                                        tjk = listOfTjkWords[i][index],
                                        ru = listOfRuWords[i][index],
                                        en = listOfEnWords[i][index],
                                        viewModel = viewModel,
                                        mp3Start = {
                                            val mp3: MediaPlayer =
                                                MediaPlayer.create(context, listOfAudio[i][index])
                                            mp3Get = !mp3Get
                                            if (mp3Get) {
                                                mp3.start()
                                                CoroutineScope(Dispatchers.Default + Job()).launch {
                                                    Log.e("Context", "job 1 -> ${Job()}")
                                                    delay(1500)
                                                    mp3Get = !mp3Get
                                                }
                                            } else if (!mp3Get) {
                                                mp3.stop()
                                            }
                                            viewModel.col.value = Green
                                        },
                                        mp3Get = mp3Get,
                                        letter = category,
                                        context = context
                                    )
                                    Log.e("TJK", "is ${listOfTjkWords[i][index]}")
                                }
                            }
                        item {
                            Spacer(Modifier.padding(vertical = 30.dp))
                        }
                    }
                }
            Spacer(modifier = Modifier.padding(vertical = 20.dp))
        }
    }
}