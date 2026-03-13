package br.com.fiap.recipes.screens

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import br.com.fiap.recipes.R
import br.com.fiap.recipes.screens.TitleComponent
import br.com.fiap.recipes.ui.theme.RecipesTheme

// *** Componente 1 - Título da tela ***
@Composable
fun TitleComponent(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.sign_up),
            color = MaterialTheme.colorScheme.primary
        )
        Text(
            text = stringResource(R.string.signup_subtitle),
            color = MaterialTheme.colorScheme.primary
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    locale = "en"
)
@Composable
private fun TitleComponentPreview() {
    RecipesTheme {
        TitleComponent()
    }
}

@Composable
fun UserImage(modifier: Modifier = Modifier){
    Box(
        modifier = Modifier
            .size(120.dp)
    ){
        Image(
            painter = painterResource(R.drawable.user),
            contentDescription = stringResource(R.string.user_image),
            modifier = Modifier
                .size(110.dp)
                .align(alignment = Alignment.Center)
        )
        Icon(
            imageVector = Icons.Default.
        )
    }
}

@Preview
@Composable
private fun UserImagePreview(){
    RecipesTheme {
        UserImage()
    }
}


@Composable
fun RecipesTheme(content: @Composable () -> TitleComponent) {
    TODO("Not yet implemented")
}