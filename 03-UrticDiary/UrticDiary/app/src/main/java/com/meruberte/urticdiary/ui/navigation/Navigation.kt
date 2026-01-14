package com.meruberte.urticdiary.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.ui.screens.entry.EntryScreen
import com.meruberte.urticdiary.ui.screens.history.HistoryScreen

sealed class Screen(val route: String) {
    object Entry : Screen("entry")
    object History : Screen("history")
}

@Composable
fun UrticDiaryNavHost(
    repository: DailyEntryRepository,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Entry.route,
        modifier = modifier
    ) {
        composable(Screen.Entry.route) {
            EntryScreen(
                repository = repository,
                onNavigateToHistory = { navController.navigate(Screen.History.route) }
            )
        }

        composable(Screen.History.route) {
            HistoryScreen(repository = repository,
                onNavigateToEntry = { navController.navigate(Screen.Entry.route) }
            )

        }
    }
}
