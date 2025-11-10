package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EntryScreen(
    viewModel: EntryViewModel = viewModel()
) {
    EntryForm(
        hivesLevel = viewModel.hivesLevel.value,
        itchLevel = viewModel.itchLevel.value,
        notes = viewModel.notes.value,
        onHivesLevelChange = {viewModel.hivesLevel.value = it},
        onItchLevelChange = {viewModel.itchLevel.value = it},
        onNotesChange = {viewModel.notes.value = it},
        onSave = {viewModel.saveEntry()},
        saved = viewModel.saved.value,
        onReset = {viewModel.resetForm()}
    )
}
