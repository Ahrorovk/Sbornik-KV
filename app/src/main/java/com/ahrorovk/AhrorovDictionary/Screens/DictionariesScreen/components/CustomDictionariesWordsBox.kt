package com.ahrorovk.AhrorovDictionary.Screens.HomeScreen.components

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.AhrorovDictionary.R
import com.ahrorovk.AhrorovDictionary.Screens.HomeScreen.presentation.innerShadows
import com.ahrorovk.AhrorovDictionary.Screens.MainViewModel
import com.ahrorovk.AhrorovDictionary.ui.theme.LogoBlue
import kotlinx.coroutines.*


@SuppressLint("InvalidColorHexValue")
@Composable
fun CustomDictionariesWordsBox(
    letter:String,
    tjk:String,
    ru:String,
    en:String,
    viewModel: MainViewModel,
    mp3Start:()->Unit,
    context: Context,
    mp3Get:Boolean
) {
    val clipboardManager: ClipboardManager = LocalClipboardManager.current
    var count by remember { mutableStateOf(false) }
    var k by remember { mutableStateOf(1) }
    val localContext = LocalContext.current
    Spacer(modifier = Modifier.padding(vertical = 6.dp))
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .padding(start = 3.dp, end = 3.dp)
                .innerShadows(
                    blur = 1.dp,
                    color = Color.LightGray,
                    cornersRadius = 5.dp,
                    offsetX = (-6.5).dp,
                    offsetY = (-3).dp
                )
                .clip(RoundedCornerShape(20.dp))

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.85f)
                    .padding(start = 8.dp),
            ) {
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = tjk,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Normal
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = ru,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Normal
                )
                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = en,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontStyle = FontStyle.Normal
                )
                Spacer(modifier = Modifier.padding(5.dp))
            }
        }

        Column() {
            Box(
                modifier = Modifier
                    .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 3.dp)
                    .innerShadows(
                        blur = 1.dp,
                        color = Color.LightGray,
                        cornersRadius = 5.dp,
                        offsetX = (-5).dp,
                        offsetY = (-2).dp
                    )
            ) {
                IconButton(modifier = Modifier
                    .padding(end = 5.dp)
                    .clip(RoundedCornerShape(30.dp)), onClick = {
                    Toast.makeText(localContext, "Скопировано", Toast.LENGTH_SHORT).show()
                    clipboardManager.setText(AnnotatedString(("$tjk $ru $en")))
                }) {
                    Log.e("Bool", " is and $count")
                    Icon(
                        painterResource(id = R.drawable.bookmark),
                        contentDescription = null
                    )
                }
            }
            Box(
                modifier = Modifier
                    .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 3.dp)
                    .innerShadows(
                        blur = 1.dp,
                        color = Color.LightGray,
                        cornersRadius = 5.dp,
                        offsetX = (-5).dp,
                        offsetY = (-2).dp
                    )
            ) {
                IconButton(modifier = Modifier
                    .padding(end = 5.dp)
                    .clip(RoundedCornerShape(30.dp)), onClick = {
                    mp3Start()
                }) {
                    Log.e("Bool", " is and $count")
                    Icon(
                        tint = if (mp3Get) LogoBlue else Color.Black,
                        painter = painterResource(id = R.drawable.ic_iconoir_sound_low),
                        contentDescription = null
                    )
                }
            }
        }
    }
}
