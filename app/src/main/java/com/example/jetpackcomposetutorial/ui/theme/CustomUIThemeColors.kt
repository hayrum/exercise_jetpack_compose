package com.example.jetpackcomposetutorial.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


@Composable
fun getCustomColorOfTextBySystemOfTheme(): Color = if (isSystemInDarkTheme()) {
    Color.White
} else {
    Color.Black
}