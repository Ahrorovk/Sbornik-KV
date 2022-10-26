package com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.presentation

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ahrorovk.gymnasiumdictionary.R
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components.CustomListOfCategories
import com.ahrorovk.gymnasiumdictionary.Screens.HomeScreen.components.HomeScreenTopAppBar
import com.ahrorovk.gymnasiumdictionary.Screens.MainViewModel
import com.ahrorovk.gymnasiumdictionary.ui.theme.BLUE
import com.ahrorovk.gymnasiumdictionary.ui.theme.LogoBlue
import com.ahrorovk.gymnasiumdictionary.ui.theme.WHITE

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(navController: NavController,viewModel: MainViewModel) {
    val listOfCategory = viewModel.listOfCategory
    Scaffold(topBar = {
        HomeScreenTopAppBar(
            backIcon= R.drawable.back,
            searchIcon= R.drawable.ic_search,
            category = "",
            value = "",
            viewModel = viewModel,
            backgroundColor = BLUE,
            iconButtonOnClick = {
                viewModel.setSearch("")
            }, bool = 2, backToHomeIconButtonOnClick = {}, backToMainIconButtonOnClick = {navController.popBackStack()})
    }) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(3),
            contentPadding = PaddingValues(8.dp),
            content ={
                items(listOfCategory){i->
                    Column(Modifier.fillMaxWidth()
                        .padding(vertical = 5.dp, horizontal = 5.dp)
                        ){
                        CustomListOfCategories(category = i) {
                            viewModel.setCategories(i)
                            navController.navigate(listOfCategory[0])
                        }
                    }
                }
            }
        )
    }
}
fun Modifier.innerShadow() = composed(
    inspectorInfo = {

    },
    factory = {

        val paint = remember() {
            Paint()
        }

        val foregroundPaint = remember() {
            Paint().apply {
                color = Color.White
            }
        }

        val frameworkPaint = remember {
            paint.asFrameworkPaint()
        }

        Modifier.drawWithContent {
            this.drawIntoCanvas {
                val color = Color.LightGray

                val radius = 10.dp.toPx()

                val shadowColor = color
                    .copy(alpha = .7f)
                    .toArgb()
                val transparent = color
                    .copy(alpha = 0f)
                    .toArgb()

                frameworkPaint.color = transparent

                frameworkPaint.setShadowLayer(
                    radius,
                    0f,
                    0f,
                    shadowColor
                )
                val shadowRadius = 4.dp.toPx()

                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = foregroundPaint
                )

                it.drawRoundRect(
                    left = 0f,
                    top = 0f,
                    right = this.size.width,
                    bottom = this.size.height,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = paint
                )

                it.drawRoundRect(
                    left = shadowRadius,
                    top = shadowRadius,
                    right = this.size.width - shadowRadius,
                    bottom = this.size.height - shadowRadius,
                    radiusX = 5.dp.toPx(),
                    radiusY = 5.dp.toPx(),
                    paint = foregroundPaint
                )
                drawContent()

            }
        }
    },
)