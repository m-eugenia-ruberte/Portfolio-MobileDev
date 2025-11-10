package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.domain.model.DailyEntry
import kotlinx.coroutines.launch
import java.time.LocalDate

class EntryViewModel(
    private val repository: DailyEntryRepository
): ViewModel(){

    var hivesLevel = mutableStateOf(0)
    var itchLevel = mutableStateOf(0)
    var notes = mutableStateOf("")
    var saved = mutableStateOf(false)

    fun saveEntry() {
        viewModelScope.launch {
            val entry = DailyEntry(
                date = LocalDate.now().toString(),
                hivesLevel = hivesLevel.value,
                itchLevel = itchLevel.value,
                notes = notes.value
            )
            repository.insert(entry)
            saved.value = true
        }
    }

    fun resetForm(){
        hivesLevel.value = 0
        itchLevel.value = 0
        notes.value = ""
        saved.value = false
    }
}