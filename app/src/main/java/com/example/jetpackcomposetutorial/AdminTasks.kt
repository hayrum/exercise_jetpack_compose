package com.example.jetpackcomposetutorial

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.navigation.GetCustomToolbar
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

@Composable
fun InitAdminTasks(navController: NavController) {
    GetCustomToolbar(
        titleView = "AdminTasks",
        contentDescription = "Arrow Back",
        unitView = {
            GetTaskCompleteComposeExample(
                title = stringResource(R.string.all_tasks_completed),
                description = stringResource(R.string.nice_work)
            )
        },
        navController = navController
    )
}

@Composable
fun GetTaskCompleteComposeExample(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    val taskCompleteImage = painterResource(id = R.drawable.ic_task_completed)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = taskCompleteImage,
            contentDescription = null,
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = description,
            fontSize = 16.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTutorialTheme {
        InitAdminTasks(rememberNavController())
    }
}