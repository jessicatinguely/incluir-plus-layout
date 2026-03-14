package br.com.fiap.incluirplus.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import br.com.fiap.incluirplus.screens.*
import androidx.compose.material.icons.filled.ExitToApp
@Composable
fun MainScreen(navController: NavHostController) {

    val bottomNavController = rememberNavController()

    Scaffold(

        bottomBar = {

            NavigationBar {

                NavigationBarItem(
                    selected = false,
                    onClick = { bottomNavController.navigate("jobs") },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Vagas") },
                    label = { Text("Vagas") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { bottomNavController.navigate("education") },
                    icon = { Icon(Icons.Default.School, contentDescription = "Capacitação") },
                    label = { Text("Capacitação") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = { bottomNavController.navigate("about") },
                    icon = { Icon(Icons.Default.Info, contentDescription = "Sobre") },
                    label = { Text("Sobre") }
                )

                NavigationBarItem(
                    selected = false,
                    onClick = {
                        navController.navigate("login") {
                            popUpTo("main") { inclusive = true }
                        }
                    },
                    icon = { Icon(Icons.Default.ExitToApp, contentDescription = "Sair") },
                    label = { Text("Sair") }
                )
            }
        }

    ) { padding ->

        NavHost(
            navController = bottomNavController,
            startDestination = "jobs",
            modifier = Modifier.padding(padding)
        ) {

            composable("jobs") {
                JobsListScreen(navController)
            }

            composable("education") {
                EducationScreen(navController)
            }

            composable("about") {
                AboutScreen()
            }
        }
    }
}