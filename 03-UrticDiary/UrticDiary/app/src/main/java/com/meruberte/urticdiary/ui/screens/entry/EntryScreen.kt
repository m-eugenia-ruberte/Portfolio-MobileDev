package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun EntryScreen(
    viewModel: EntryViewModel = viewModel()
) {
    EntryForm(
        onSave = {hives, itch, notes ->
            viewModel.hivesLevel = hives
            viewModel.itchLevel = itch
            viewModel.notes = notes
            viewModel.saveEntry()
        }
    )
}
