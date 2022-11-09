package com.ahrorovk.AhrorovDictionary.Screens.HomeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Cancel
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.AhrorovDictionary.Constants
import com.ahrorovk.AhrorovDictionary.R
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel
import com.ahrorovk.AhrorovDictionary.ui.theme.WHITE


@Composable
fun HomeScreenTopAppBar(
    category:String,
    backgroundColor: Color,
    value:String,
    iconButtonOnClick:()->Unit,
    viewModel: MainViewModel,
    bool :Int,
    backToHomeIconButtonOnClick:()->Unit,
    backToMainIconButtonOnClick:()->Unit,
    searchIcon:Int,
    backIcon:Int
)
{
    var bool1 by remember{ mutableStateOf(false)}
    Box(modifier= Modifier
        .fillMaxWidth()
        .height(55.dp)
        .background(backgroundColor)) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 6.dp, end = 6.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            if(bool==1) {
                if (!bool1) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        IconButton(onClick = { backToHomeIconButtonOnClick() }) {
                            Icon(
                                tint = WHITE,
                                painter = painterResource(id = backIcon),
                                contentDescription = null
                            )
                        }
                        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
                        Text(
                            category,
                            fontSize = 18.sp,
                            color = WHITE,
                            fontWeight = FontWeight.SemiBold,
                            fontFamily = FontFamily.SansSerif
                        )
                    }
                    Row() {

                        IconButton(onClick = { bool1 = !bool1 }) {
                            Icon(
                                tint = WHITE,
                                painter = painterResource(id = searchIcon),
                                contentDescription = null
                            )
                        }
                    }
                } else {
                        Row(modifier=Modifier.padding()) {
                            TextField(
                                modifier = Modifier
                                    .fillMaxWidth(0.8f)
                                    .fillMaxHeight(0.95f)
                                    .clip(RoundedCornerShape(19.dp)),
                                value = value,
                                leadingIcon = {
                                    Icon(
                                        modifier = Modifier.clickable {
                                            viewModel.setSearch("")
                                            bool1 = !bool1
                                                                      },
                                        tint = if (!bool1) WHITE else Color.Gray,
                                        painter = painterResource(id = searchIcon),
                                        contentDescription = null
                                    )
                                },
                                onValueChange = {
                                    viewModel.setSearch(it)
                                },
                                placeholder = {
                                    Text(if(Constants.tjk) stringResource(id = R.string.wordSearchTjk)
                                    else if (Constants.ru) stringResource(id = R.string.wordSearchRu)
                                    else if(Constants.en) stringResource(id = R.string. wordSearchEn )
                                    else stringResource(id = R.string.wordSearchTjk), fontSize = 12.sp)
                                },
                                colors = TextFieldDefaults.textFieldColors(
                                    textColor = Color.Black,
                                    disabledTextColor = Color.Transparent,
                                    backgroundColor = WHITE,
                                    focusedIndicatorColor = Color.Transparent,
                                    unfocusedIndicatorColor = Color.Transparent,
                                    disabledIndicatorColor = Color.Black
                                )
                            )
                            if (value != "") {
                                IconButton(onClick = {
                                    viewModel.setSearch("")
//                                bool1 = !bool1
                                }) {
                                    Icon(
                                        modifier = Modifier.size(25.dp).fillMaxWidth(0.2f),
                                        tint = WHITE,
                                        imageVector = Icons.Outlined.Cancel,
                                        contentDescription = null
                                    )
                                }
                            }
                        }
                }
            }
            else if(bool == 2) {
                IconButton(onClick = { backToMainIconButtonOnClick() }) {
                    Icon(
                        tint = WHITE,
                        painter = painterResource(id = backIcon),
                        contentDescription = null
                    )
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = if(Constants.tjk) stringResource(id = R.string.vocabularyForStudentsTjk)
                    else if (Constants.ru) stringResource(id = R.string.vocabularyForStudentsRu)
                    else if(Constants.en) stringResource(id = R.string. vocabularyForStudentsEn )
                    else stringResource(id = R.string.vocabularyForStudentsTjk),
                    fontSize = 18.sp,
                    color = WHITE,
                    fontWeight = FontWeight.SemiBold,
                    fontFamily = FontFamily.SansSerif
                )

            }
        }
    }
}

