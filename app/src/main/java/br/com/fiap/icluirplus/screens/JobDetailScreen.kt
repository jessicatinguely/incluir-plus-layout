package br.com.fiap.icluirplus.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.icluirplus.data.MockData
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon


@Composable
fun JobDetailScreen(navController: NavController, jobId: Int) {

    val job  = MockData.jobs.first { it.id == jobId }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text(job.title, style = MaterialTheme.typography.headlineSmall)

        Text(job.company)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Descrição")

        Text(job.description)

        Spacer(modifier = Modifier.height(16.dp))

        Text("Requisitos")

        Text(job.requirements)

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = { navController.navigate("register") }
        ) {
            Text("Candidatar-se")
        }
        IconButton(onClick = { navController.popBackStack() }) {
            Icon(Icons.Default.ArrowBack, contentDescription = "Voltar")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun JobDetailScreenPreview() {

    JobDetailScreen(
        navController = rememberNavController(),
        jobId = 1
    )

}