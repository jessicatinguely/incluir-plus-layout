package br.com.fiap.icluirplus.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import br.com.fiap.icluirplus.screens.EducationScreen
import br.com.fiap.icluirplus.screens.JobDetailScreen
import br.com.fiap.icluirplus.screens.JobsListScreen
import br.com.fiap.icluirplus.screens.LoginScreen
import br.com.fiap.icluirplus.screens.RegistrationScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("jobs") {
            JobsListScreen(navController)
        }

        composable("jobDetail/{jobId}") { backStackEntry ->

            val jobId = backStackEntry.arguments
                ?.getString("jobId")
                ?.toInt() ?: 0

            JobDetailScreen(navController, jobId)
        }

        composable("register") {
            RegistrationScreen(navController)
        }

        composable("education") {
               EducationScreen(navController)
        }
    }
}