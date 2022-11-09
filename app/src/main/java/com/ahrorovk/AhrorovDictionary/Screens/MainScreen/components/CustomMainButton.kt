package com.ahrorovk.AhrorovDictionary.Screens.MainScreen.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomMainButton(
    text:String,
    textColor:Color,
    buttonColor: Color,
    gradient:Brush,
    modifier:Modifier=Modifier,
    onClick:()->Unit
) {
    GradientButton(
        modifier = Modifier
            .width(283.dp)
            .height(50.dp),
        shape = RoundedCornerShape(28.dp),
        onClick = { onClick() },
        gradient = gradient
    ) {
        Text(
            text = text, fontSize = 16.sp, color = textColor
        )
    }
}