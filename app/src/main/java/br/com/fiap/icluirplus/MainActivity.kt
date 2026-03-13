package br.com.fiap.icluirplus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import br.com.fiap.icluirplus.navigation.AppNavigation
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.ui.Alignment
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MaterialTheme {

                Scaffold(

                    topBar = {

                        CenterAlignedTopAppBar(

                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = Color(0xFFC9BEDF)
                            ),

                            title = {

                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {

                                    Image(
                                        painter = painterResource(id = R.drawable.incluir_logo),
                                        contentDescription = "Logo",
                                        modifier = Modifier.size(100.dp)
                                    )


                                    Column {

                                        Text(
                                            text = "Incluir+",
                                            style = MaterialTheme.typography.headlineMedium
                                        )

                                        Text(
                                            text = "Vagas inclusivas para você",
                                            style = MaterialTheme.typography.bodyMedium
                                        )
                                    }

                                }

                            }

                        )
                    }

                ) { paddingValues ->

                    Box(
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        AppNavigation()
                    }

                }

            }

        }
    }
}

