package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.navigation.GetCustomToolbar
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme
import com.example.jetpackcomposetutorial.ui.theme.getCustomColorOfTextBySystemOfTheme


@Composable
fun InitViewWithToolbarImage(navController: NavController) {
    GetCustomToolbar(
        titleView = "ViewWithToolbarImage",
        contentDescription = "Arrow Back",
        unitView = {
            GetTutorialComposeExample(
                title = stringResource(id = R.string.app_name),
                firstParagraph = stringResource(id = R.string.firstParagraph),
                secondParagraph = stringResource(id = R.string.secondParagraph)
            )
        },
        navController = navController
    )
}

/**
 * Show different composable components of example (tutorial).
 */
@Composable
fun GetTutorialComposeExample(
    title: String,
    firstParagraph: String,
    secondParagraph: String,
    modifier: Modifier = Modifier
) {
    val colorText = getCustomColorOfTextBySystemOfTheme()
    val imageTop = painterResource(id = R.drawable.bg_compose_background)
    Column(modifier = modifier.verticalScroll(rememberScrollState())) {
        Image(
            painter = imageTop,
            contentDescription = null
        )
        Text(
            text = title,
            fontSize = 24.sp,
            color = colorText,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = firstParagraph,
            color = colorText,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = secondParagraph,
            color = colorText,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ViewWithToolbarImagePreview() {
    JetpackComposeTutorialTheme {
        InitViewWithToolbarImage(rememberNavController())
    }
}