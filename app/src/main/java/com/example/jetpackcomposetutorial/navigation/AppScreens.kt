package com.example.jetpackcomposetutorial.navigation

sealed class AppScreens(val route: String) {
    data object ListOfExampleExercisesViews: AppScreens("list_of_example_exercises_views")
    data object AdminTasks: AppScreens("admin_tasks")
    data object ComposeQuadrant: AppScreens("compose_quadrant")
    data object DiceRoller: AppScreens("dice_roller")
    data object ListOfObjectsWithLazyColumn: AppScreens("list_of_objects_with_lazy_column")
    data object PrepareLemonade:  AppScreens("prepare_lemonade")
    data object PresentationCard : AppScreens("presentation_card")
    data object ViewWithToolbarImage : AppScreens("view_with_toolbar_image")
}