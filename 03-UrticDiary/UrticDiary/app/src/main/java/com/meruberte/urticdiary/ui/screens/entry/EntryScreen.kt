package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

@Composable
fun EntryScreen(
    repository: DailyEntryRepository,
    onNavigateToHistory: () -> Unit = {}
) {
    val viewModel: EntryViewModel = viewModel(
        factory = EntryViewModelFactory(repository)
    )
    EntryForm(
        hivesLevel = viewModel.hivesLevel.value,
        itchLevel = viewModel.itchLevel.value,
        notes = viewModel.notes.value,
        onHivesLevelChange = {viewModel.hivesLevel.value = it},
        onItchLevelChange = {viewModel.itchLevel.value = it},
        onNotesChange = {viewModel.notes.value = it},
        onSave = {viewModel.saveEntry()},
        saved = viewModel.saved.value,
        onReset = {viewModel.resetForm()},
        onNavigateToHistory= onNavigateToHistory
    )

}
