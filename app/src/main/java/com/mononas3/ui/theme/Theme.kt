package com.mononas3.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val CustomLightColors = lightColors(
    primary = Color.Green, // Cambia el color principal según tus preferencias
    onPrimary = Color.White,
    /* Otros colores */
)

@Composable
fun Mononas3Theme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = CustomLightColors,
        content = content
    )
}
