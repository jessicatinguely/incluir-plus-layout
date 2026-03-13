package br.com.fiap.recipes.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopEndCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .width(160.dp)
            .height(85.dp),
        shape = RoundedCornerShape (
            bottomStart = 85.dp
        ),
        colors = CardDefaults
            .cardColors (
                containerColor = MaterialTheme.colorScheme.primary
            )
    ){}
}

@Preview
@Composable
private fun TopEndCardPreview(){
    RecipesTheme {
        TopEndCard()
    }
}

@Composable
fun BottomStartCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .width(160.dp)
            .height(85.dp),
        shape = RoundedCornerShape(
            topEnd = 85.dp
        ),
        colors = CardDefaults
            .cardColors(
                containerColor = MaterialTheme.colorScheme.primary
            )
    ){}
}

@Preview
@Composable
private fun BottomStartCard(){
    RecipesTheme {
        BottomStartCard()
    }
}