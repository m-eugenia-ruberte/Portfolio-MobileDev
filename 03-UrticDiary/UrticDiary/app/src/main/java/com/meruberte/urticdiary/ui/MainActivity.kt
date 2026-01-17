package com.meruberte.urticdiary.ui

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import com.meruberte.urticdiary.core.notifications.NotificationPermissionHelper
import com.meruberte.urticdiary.data.local.UrticDiaryDatabase
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.ui.navigation.UrticDiaryNavHost
import com.meruberte.urticdiary.ui.screens.history.HistoryScreen
import com.meruberte.urticdiary.ui.screens.settings.SettingsScreen
import com.meruberte.urticdiary.ui.theme.UrticDiaryTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (NotificationPermissionHelper.hasPermission(this)) {
            ReminderScheduler.scheduleDailyReminder(applicationContext)
        } else {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                notificationPermissionLauncher.launch(
                    Manifest.permission.POST_NOTIFICATIONS
                )
            }
        }

        // Instanciar base de datos y repositorio
        val database = UrticDiaryDatabase.getDatabase(applicationContext)
        val repository = DailyEntryRepository(database.dailyEntryDao())

        setContent {
            UrticDiaryTheme {
                UrticDiaryNavHost(repository = repository)
            }
        }
    }
    private val notificationPermissionLauncher =
        registerForActivityResult(
            ActivityResultContracts.RequestPermission()
        ) { granted ->
            if (granted) {
                ReminderScheduler.scheduleDailyReminder(applicationContext)
            }
        }

}