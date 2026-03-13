package br.com.fiap.icluirplus.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun RegistrationScreen(navController: NavController) {

    val context = LocalContext.current

    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var city by remember { mutableStateOf("") }
    var interest by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {

        Text("Cadastro", style = MaterialTheme.typography.headlineSmall)

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Nome") }
        )

        OutlinedTextField(phone, { phone = it }, label = { Text("Telefone") })

        OutlinedTextField(city, { city = it }, label = { Text("Cidade") })

        OutlinedTextField(interest, { interest = it }, label = { Text("Área de interesse") })

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Toast.makeText(context, "Candidatura enviada!", Toast.LENGTH_LONG).show()
                navController.navigate("jobs")
            }
        ) {
            Text("Enviar Candidatura")
        }

    }
}

@Preview(showBackground = true)
@Composable
fun RegistrationScreenPreview() {
    RegistrationScreen(navController = rememberNavController())
}