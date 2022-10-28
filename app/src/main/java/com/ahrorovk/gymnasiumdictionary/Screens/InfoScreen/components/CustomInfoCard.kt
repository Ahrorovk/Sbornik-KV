package com.ahrorovk.gymnasiumdictionary.Screens.InfoScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.gymnasiumdictionary.R

@Composable
fun CustomInfoCard(text:String,imageOfAuthor: Int,about:String,developer:String,publishedBy:String) {

   Column(
       modifier = Modifier.fillMaxSize()
   ){
       Box(
           modifier = Modifier
               .fillMaxWidth()
       ) {
           LazyColumn(horizontalAlignment = Alignment.CenterHorizontally) {
               item {
                   Spacer(modifier = Modifier.padding(vertical = 8.dp))
                   Image(
                       contentScale = ContentScale.FillHeight,
                       painter = painterResource(id = imageOfAuthor),
                       contentDescription = null,
                       modifier = Modifier
                           .width(383.dp)
                           .height(320.dp)
                   )
                   Spacer(modifier = Modifier.padding(vertical = 6.dp))
                   Text(
                       textAlign = TextAlign.Center,
                       text = text,
                       color = Color.Black,
                       fontSize = 18.sp,
                       fontWeight = FontWeight.Bold,
                       fontStyle = FontStyle.Italic,
                       fontFamily = FontFamily.SansSerif
                   )
                   Spacer(modifier = Modifier.padding(vertical = 6.dp))
                   Text(
                       textAlign = TextAlign.Center,
//                       modifier = Modifier.fillMaxWidth().padding(start = 5.dp),
                       text = publishedBy,
                       color = Color.Black,
                       fontSize = 17.sp,
                       fontStyle = FontStyle.Normal,
                       fontWeight = FontWeight.Normal,
                       fontFamily = FontFamily.SansSerif
                   )
                   Spacer(modifier = Modifier.padding(vertical = 6.dp))
                   Text(
                       modifier = Modifier.fillMaxWidth().padding(start = 5.dp),
                       text = developer,
                       color = Color.Black,
                       fontSize = 15.sp,
                       fontStyle = FontStyle.Normal,
                       fontFamily = FontFamily.SansSerif
                   )
                   Spacer(modifier = Modifier.padding(vertical = 6.dp))


               }
           }
       }
       Box(modifier= Modifier
           .fillMaxSize()
           .padding(20.dp), contentAlignment = Alignment.BottomCenter){
           Text(
               text = about,
               textAlign = TextAlign.Center,
               color = Color.Black,
               fontSize = 12.sp,
               fontWeight = FontWeight.SemiBold,
               fontStyle = FontStyle.Italic,
               fontFamily = FontFamily.SansSerif
           )
       }
   }
}