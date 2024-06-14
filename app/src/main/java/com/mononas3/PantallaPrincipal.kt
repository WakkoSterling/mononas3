package com.mononas3.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mononas3.R
import com.mononas3.ui.theme.Mononas3Theme

@Composable
fun PantallaPrincipal(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize().background(Color.Magenta), // Fondo violeta
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextoConEstilo(
                texto = stringResource(id = R.string.titulo_principal),
                color = Color.DarkGray,
                style = MaterialTheme.typography.h5
            )

            Button(
                onClick = { /* Acción del botón Consultar */ },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
                modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.boton_consultas),
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("pantalla_inventario") },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
                modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp)
            ) {
                Text(
                    text = stringResource(id = R.string.boton_inventario),
                    color = Color.White
                )
            }
        }
    }
}
/*
@Composable
fun TextoConEstilo(texto: String, color: Color, style: androidx.compose.ui.text.TextStyle) {
    Text(
        text = texto,
        color = color,
        style = style,
        modifier = Modifier.padding(vertical = 8.dp)
    )
}*/

@Preview(showBackground = true)
@Composable
fun PantallaPrincipalPreview() {
    Mononas3Theme {
        PantallaPrincipal(navController = rememberNavController())
    }
}
