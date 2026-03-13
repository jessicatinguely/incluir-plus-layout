package br.com.fiap.recipes.screens
import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.fiap.recipes.R

@Composable
fun InitialScreen(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ){
        TopEndCard(modifier = Modifier.align(Alignment.TopEnd))
        BottomStartCard(modifier = Modifier.align(Alignment.BottomStart))
        Column(
            modifier = Modifier
                .padding(horizontal= 48.dp, vertical = 16.dp)
                .filMaxWidht()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.cooking),
                contentDescription = "Imagem de uma mulher cozinhando.",
                modifier = Modifier.size(190.dp)
            )
            Spacer(modifier = Modifier.height(100.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
            ){
                Text(
                    text = stringResource(R.string.unlimited_recipes),
                    fontSize = 16.sp,
                    color = MaterialTheme.colorScheme.secondary,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))
                //TEXTO START COOKING
                Text(
                    text = stringResource(R.string.app_title),
                    fontSize = 64.sp,
                    lineHeight =  64.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .padding(top = 8.dp, bottom = 16.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Row{
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            ),
                        border = BorderStroke(
                            widht = 1.dp,
                            color = MaterialTheme.colorScheme.terciary
                        ),
                        modifier = Modifier
                            .height = (48.dp)
                    ){
                        //TEXTO DO BOTÃO DE LOGIN
                        Text (
                            text = stringResource(R.string.button_login),
                            color = MaterialTheme.colorScheme.onPrimary,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                    Spacer(modifier = Modifier.width (8.dp))
                    Button (
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                                containerColor = MaterialTheme.colorScheme.tertiary
                        ),
                        border = BorderStroke(
                            widht = 1.dp,
                            color = MaterialTheme.colorScheme.primary
                        ),
                        modifier = Modifier
                            .height(height = 48.dp)
                    ) {
                        //tTEXTO DO BOTÃO SING UP
                        Text(
                            text = stringResource(R.string.button_singup),
                            color = MaterialTheme.colorScheme.onTertiary,
                            fontSize =  16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)

@Composable
fun InitialScreenPreview(){
    RecipesTheme {
        InitialScreen()
    }
}

@Composable
fun RecipesTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}