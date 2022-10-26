package com.ahrorovk.gymnasiumdictionary.Screens.MainScreen.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLACK

@Composable
fun CustomMainButton(
    text:String,
    textColor:Color,
    buttonColor: Color,
    onClick:()->Unit
) {
    Button(
        modifier = Modifier
            .width(236.dp)
            .height(56.dp)

//            .offset(x=15.dp,y=10.dp)
//            .blur(radius = 85.dp)
            .border(width = 1.dp, buttonColor, RoundedCornerShape(23.dp)),
        shape = RoundedCornerShape(23.dp),
        onClick = { onClick() },
        colors = ButtonDefaults.buttonColors(buttonColor),

    ) {
        Text(
            text = text, fontSize = 16.sp, color = textColor
        )
    }
}