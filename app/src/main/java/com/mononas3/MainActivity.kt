package com.mononas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mononas3.pantallas.PantallaInventario
import com.mononas3.pantallas.PantallaPrincipal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Pantallas.PantallaPrincipal.route) {
                composable(Pantallas.PantallaPrincipal.route) { PantallaPrincipal(navController = navController) }
                composable(Pantallas.PantallaInventario.route) { PantallaInventario(navController = navController) }
            }
        }
    }
}

sealed class Pantallas(val route: String) {
    object PantallaPrincipal : Pantallas("pantalla_principal")
    object PantallaInventario : Pantallas("pantalla_inventario")
}
