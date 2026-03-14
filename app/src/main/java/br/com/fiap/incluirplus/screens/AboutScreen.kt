package br.com.fiap.incluirplus.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import br.com.fiap.incluirplus.R


@Composable
fun AboutScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.incluir_logo),
            contentDescription = "Logo Incluir+",
            modifier = Modifier.size(120.dp)
        )


        Text(
            text = "O aplicativo Incluir+ tem como objetivo promover inclusão social conectando pessoas a oportunidades de emprego e conteúdos de capacitação.",
            style = MaterialTheme.typography.bodyLarge
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Projeto acadêmico focado no pilar Social do ESG.",
            style = MaterialTheme.typography.bodyMedium
        )
    }
}