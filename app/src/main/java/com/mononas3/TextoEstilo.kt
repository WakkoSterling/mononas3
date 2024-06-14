package com.mononas3.pantallas

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TextoConEstilo(texto: String, color: Color, style: TextStyle) {
    Text(
        text = texto,
        color = color,
        style = style,
        textAlign = TextAlign.Center // Centra el texto horizontalmente
    )
}
