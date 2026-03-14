package br.com.fiap.incluirplus.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.School
import androidx.compose.material.icons.filled.Info

import br.com.fiap.incluirplus.screens.*

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("register") {
            RegistrationScreen(navController)
        }

        composable("main") {
            MainScreen(navController)
        }

        composable("jobDetail/{jobId}") { backStackEntry ->

            val jobId = backStackEntry.arguments
                ?.getString("jobId")
                ?.toInt() ?: 0

            JobDetailScreen(navController, jobId)
        }
    }
}