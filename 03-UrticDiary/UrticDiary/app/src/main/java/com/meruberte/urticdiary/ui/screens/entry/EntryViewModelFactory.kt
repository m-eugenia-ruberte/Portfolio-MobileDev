package com.meruberte.urticdiary.ui.screens.entry

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

class EntryViewModelFactory(
    private val repository: DailyEntryRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(EntryViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return EntryViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
