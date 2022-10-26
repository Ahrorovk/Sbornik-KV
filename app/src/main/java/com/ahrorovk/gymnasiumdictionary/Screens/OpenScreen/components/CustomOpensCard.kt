package com.ahrorovk.gymnasiumdictionary.Screens.OpenScreen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE
import kotlinx.coroutines.CoroutineScope

@Composable
fun CustomOpensCard(
    image:Int,
    alpha:Float
) {
    Box(modifier= Modifier.fillMaxSize(),
        contentAlignment=Alignment.Center
    ) {
        Column(modifier=Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                Image(
                    modifier = Modifier
                        .clip(RoundedCornerShape(150.dp))
                        .size(75.dp),
                    alpha=alpha,
                    painter = painterResource(id = image),
                    contentDescription = "Logo"
                )
            }
        }
    }
}