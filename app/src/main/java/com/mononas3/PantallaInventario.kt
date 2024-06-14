package com.mononas3.pantallas

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.mononas3.R
import com.mononas3.ui.theme.Mononas3Theme

@Composable
fun PantallaInventario(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextoConEstilo(
            texto = stringResource(id = R.string.titulo_inventario),
            color = Color.DarkGray,
            style = MaterialTheme.typography.h5)

        Button(
            onClick = { /* Acción del botón Ingresar Producto */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Green, contentColor = Color.White),
            modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp),

        ) {
            Text(
                text = stringResource(id = R.string.boton_ingresar_producto),
                color = Color.White
            )
        }

        Button(
            onClick = { /* Acción del botón Modificar Producto */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray, contentColor = Color.White),
            modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(
                text = stringResource(id = R.string.boton_modificar_producto),
                color = Color.White
            )
        }

        Button(
            onClick = { /* Acción del botón Eliminar Producto */ },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red, contentColor = Color.White),
            modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(
                text = stringResource(id = R.string.boton_eliminar_producto),
                color = Color.White
            )
        }

        Button(
            onClick = { navController.popBackStack() },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue, contentColor = Color.White),
            modifier = Modifier.fillMaxWidth(0.5f).padding(vertical = 8.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            Text(
                text = stringResource(id = R.string.boton_volver),
                color = Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PantallaInventarioPreview() {
    Mononas3Theme {
        PantallaInventario(navController = rememberNavController())
    }
}
