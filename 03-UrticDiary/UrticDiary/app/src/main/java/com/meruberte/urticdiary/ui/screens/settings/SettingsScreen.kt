package com.meruberte.urticdiary.ui.screens.settings

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel = hiltViewModel()
) {
    val hour by viewModel.reminderHour.collectAsState()
    val minute by viewModel.reminderMinute.collectAsState()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Configuración") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text("Hora del recordatorio diario")

            // Aquí podrías usar un NumberPicker, Slider o un Row con botones para ajustar
            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { viewModel.updateReminderHour((hour + 1) % 24) }) {
                    Text("+")
                }
                Text("$hour h", modifier = Modifier.padding(horizontal = 16.dp))
                Button(onClick = { viewModel.updateReminderHour((hour + 23) % 24) }) {
                    Text("-")
                }
            }

            Text("Minuto del recordatorio")
            Row(verticalAlignment = Alignment.CenterVertically) {
                Button(onClick = { viewModel.updateReminderMinute((minute + 1) % 60) }) {
                    Text("+")
                }
                Text("$minute m", modifier = Modifier.padding(horizontal = 16.dp))
                Button(onClick = { viewModel.updateReminderMinute((minute + 59) % 60) }) {
                    Text("-")
                }
            }
        }
    }
}
