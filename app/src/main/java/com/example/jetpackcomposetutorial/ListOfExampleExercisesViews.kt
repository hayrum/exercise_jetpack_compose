package com.example.jetpackcomposetutorial

import androidx.annotation.VisibleForTesting
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.navigation.AppScreens
import com.example.jetpackcomposetutorial.navigation.GetCustomToolbar
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme


@Composable
fun InitViewListOfExampleExercisesViews(navController: NavController) {
    GetCustomToolbar(
        titleView = "ListOfExampleExercisesViews",
        unitView = {
            ListOfExampleExercisesViews(navController = navController)
        },
        navController = navController
    )
}

@Composable
fun ListOfExampleExercisesViews(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ComposableInfoView(
            title = stringResource(id = R.string.AdminTasks),
            description = stringResource(id = R.string.AdminTasks_description),
            backgroundColor = Color(0xFFF8BBD0),
            navController = navController,
            route = AppScreens.AdminTasks.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.ComposeQuadrant),
            description = stringResource(id = R.string.ComposeQuadrant_description),
            backgroundColor = Color(0xFFFFCCBC),
            navController = navController,
            route = AppScreens.ComposeQuadrant.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.DiceRoller),
            description = stringResource(id = R.string.DiceRoller_description),
            backgroundColor = Color(0xFFF8BBD0),
            navController = navController,
            route = AppScreens.DiceRoller.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.ListOfObjectsWithLazyColumn),
            description = stringResource(id = R.string.ListOfObjectsWithLazyColumn_description),
            backgroundColor = Color(0xFFFFCCBC),
            navController = navController,
            route = AppScreens.ListOfObjectsWithLazyColumn.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.PrepareLemonade),
            description = stringResource(id = R.string.PrepareLemonade_description),
            backgroundColor = Color(0xFFF8BBD0),
            navController = navController,
            route = AppScreens.PrepareLemonade.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.PresentationCard),
            description = stringResource(id = R.string.PresentationCard_description),
            backgroundColor = Color(0xFFFFCCBC),
            navController = navController,
            route = AppScreens.PresentationCard.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.ViewWithToolbarImage),
            description = stringResource(id = R.string.ViewWithToolbarImage_description),
            backgroundColor = Color(0xFFF8BBD0),
            navController = navController,
            route = AppScreens.ViewWithToolbarImage.route,
            modifier = modifier
        )
        ComposableInfoView(
            title = stringResource(id = R.string.tip_time),
            description = stringResource(id = R.string.tip_time_description),
            backgroundColor = Color(0xFFFFCCBC),
            navController = navController,
            route = AppScreens.TipTime.route,
            modifier = modifier
        )
    }
}

@VisibleForTesting
@Composable
fun ComposableInfoView(
    title: String,
    description: String,
    backgroundColor: Color,
    navController: NavController,
    route: String,
    modifier: Modifier = Modifier
) {
    val modifierColumn = if (isSystemInDarkTheme()) {
        modifier
            .fillMaxSize()
            .padding(16.dp)
    } else {
        modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    }
    Card(
        modifier = modifier
            .padding(16.dp)
    ) {
        Column(
            modifier = modifierColumn,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = description,
                textAlign = TextAlign.Justify
            )
            Button(
                onClick = {
                    navController.navigate(route = route)
                },
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
                modifier = modifier
            ) {
                Text(
                    text = title,
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview5() {
    JetpackComposeTutorialTheme {
        InitViewListOfExampleExercisesViews(rememberNavController())
    }
}