package com.meruberte.urticdiary.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.meruberte.urticdiary.ui.screens.entry.EntryScreen
import com.meruberte.urticdiary.ui.theme.UrticDiaryTheme


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UrticDiaryTheme {
                EntryScreen()
            }
        }
    }
}