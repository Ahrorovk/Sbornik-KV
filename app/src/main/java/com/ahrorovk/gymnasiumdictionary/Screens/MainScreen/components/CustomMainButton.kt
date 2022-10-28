package com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.components.GradientButton
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLACK

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