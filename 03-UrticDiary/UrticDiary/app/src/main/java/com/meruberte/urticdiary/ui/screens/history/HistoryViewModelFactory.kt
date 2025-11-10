package com.meruberte.urticdiary.ui.screens.history


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

class HistoryViewModelFactory(
    private val repository: DailyEntryRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HistoryViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return HistoryViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
