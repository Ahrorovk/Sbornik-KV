package com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.presentation.innerShadow
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.presentation.innerShadows
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLACK
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE

@Composable
fun CustomListOfCategories(
    category:String,
    onClick:()->Unit
) {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .clickable { onClick() }
            .background(Color.White)
            .innerShadows(
                blur = 1.dp,
                color = Color.LightGray,
                cornersRadius = 5.dp,
                offsetX = (-5).dp,
                offsetY = (-2).dp
            )
        ,

        contentAlignment = Alignment.Center
    ){
        Text(
            modifier = Modifier.padding(start = 5.dp).padding(vertical = 9.dp),
            text = category,
            textAlign= TextAlign.Center,
            color = BLACK,
            fontSize = 20.sp,
            fontFamily = FontFamily.SansSerif,
        )
    }
}