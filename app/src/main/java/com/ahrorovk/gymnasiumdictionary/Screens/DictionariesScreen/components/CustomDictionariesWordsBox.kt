package com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components

import android.annotation.SuppressLint
import android.content.Context
import android.media.MediaPlayer
import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Bookmarks
import androidx.compose.material.icons.filled.VolumeMute
import androidx.compose.material.icons.outlined.Bookmarks
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ClipboardManager
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.presentation.innerShadow
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.Green
import com.ahrorovk.gymnasiumdictionary.ui.theme.LogoBlue
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
//    var text by remember { mutableStateOf("")}

//    Column(modifier = Modifier.fillMaxSize()) {
//
//        TextField(value = text, onValueChange = {text = it})
//        Button(onClick = {
//            clipboardManager.setText(AnnotatedString(("$tjk $ru $en")))
//        }) {
//            Text("Copy")
//        }
//
//        Button(onClick = {
//            clipboardManager.getText()?.text?.let {
//                text = it
//            }
//        }) {
//            Text("Get")
//        }
//    }
    val coroutine = rememberCoroutineScope()
    var color by viewModel.col
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
                .innerShadow()
                .clip(RoundedCornerShape(20.dp))
//                .background(BLUE)

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
                    textDecoration = TextDecoration.Underline,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
//                    Spacer(modifier = Modifier.padding(5.dp))
                Spacer(modifier = Modifier.padding(2.dp))
//                Divider()
//                Icon(
//                    modifier = Modifier
//                        .fillMaxWidth(0.1f)
//                        .size(20.dp),
//                    painter = painterResource(id = R.drawable.divider),
//                    contentDescription = null
//                )
//                    Spacer(modifier = Modifier.padding(5.dp))
//                Spacer(modifier = Modifier.padding(2.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = ru,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
//                    Spacer(modifier = Modifier.padding(5.dp))
//                Spacer(modifier = Modifier.padding(2.dp))
                /*Icon(
                    modifier = Modifier
                        .fillMaxWidth(0.1f)
                        .size(20.dp),
                    painter = painterResource(id = R.drawable.divider),
                    contentDescription = null
                )*/
                Spacer(modifier = Modifier.padding(2.dp))
//                Divider()
//                    Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = en,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Normal
                )
                Spacer(modifier = Modifier.padding(5.dp))
            }
        }

        Column() {
            Box(
                modifier = Modifier
                    .padding(start = 3.dp, end = 3.dp, top = 3.dp, bottom = 3.dp)
//                    .clip(RoundedCornerShape(20.dp))
                    .innerShadow()
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
//                    .clip(RoundedCornerShape(20.dp))
                    .innerShadow()
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
