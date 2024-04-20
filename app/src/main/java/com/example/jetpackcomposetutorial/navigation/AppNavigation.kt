package com.example.jetpackcomposetutorial.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposetutorial.InitAdminTasks
import com.example.jetpackcomposetutorial.InitComposeQuadrant
import com.example.jetpackcomposetutorial.InitDiceRoller
import com.example.jetpackcomposetutorial.InitListOfObjectWithLazyColumn
import com.example.jetpackcomposetutorial.InitPrepareLemonade
import com.example.jetpackcomposetutorial.InitPresentationCard
import com.example.jetpackcomposetutorial.InitViewListOfExampleExercisesViews
import com.example.jetpackcomposetutorial.InitViewWithToolbarImage


@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.ListOfExampleExercisesViews.route
    ) {
        composable(route = AppScreens.ListOfExampleExercisesViews.route) {
            InitViewListOfExampleExercisesViews(navController = navController)
        }
        composable(route = AppScreens.AdminTasks.route) {
            InitAdminTasks(navController = navController)
        }
        composable(route = AppScreens.ComposeQuadrant.route) {
            InitComposeQuadrant(navController = navController)
        }
        composable(route = AppScreens.DiceRoller.route) {
            InitDiceRoller(navController = navController)
        }
        composable(route = AppScreens.ListOfObjectsWithLazyColumn.route) {
            InitListOfObjectWithLazyColumn(navController = navController)
        }
        composable(route = AppScreens.PrepareLemonade.route) {
            InitPrepareLemonade(navController = navController)
        }
        composable(route = AppScreens.PresentationCard.route) {
            InitPresentationCard(navController = navController)
        }
        composable(route = AppScreens.ViewWithToolbarImage.route) {
            InitViewWithToolbarImage(navController = navController)
        }
    }
}