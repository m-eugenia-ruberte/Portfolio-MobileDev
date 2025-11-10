package com.meruberte.urticdiary.ui.screens.entry

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.domain.model.DailyEntry
import kotlinx.coroutines.launch

class EntryViewModel(
    private val repository: DailyEntryRepository
): ViewModel(){

    var hivesLevel: Int = 0
    var itchLevel: Int = 0
    var notes: String = ""

    fun saveEntry() {
        viewModelScope.launch {
            val entry = DailyEntry(
                date = "2025-11-09",
                hivesLevel = hivesLevel,
                itchLevel = itchLevel,
                notes = notes
            )
            repository.insert(entry)
        }
    }
}