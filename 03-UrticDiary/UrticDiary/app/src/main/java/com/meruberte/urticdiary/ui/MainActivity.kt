package com.meruberte.urticdiary.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.meruberte.urticdiary.data.local.UrticDiaryDatabase
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.ui.screens.entry.EntryScreen
import com.meruberte.urticdiary.ui.theme.UrticDiaryTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Instanciar base de datos y repositorio
        val database = UrticDiaryDatabase.getDatabase(applicationContext)
        val repository = DailyEntryRepository(database.dailyEntryDao())

        setContent {
            UrticDiaryTheme {
                EntryScreen(repository = repository)
            }
        }
    }
}