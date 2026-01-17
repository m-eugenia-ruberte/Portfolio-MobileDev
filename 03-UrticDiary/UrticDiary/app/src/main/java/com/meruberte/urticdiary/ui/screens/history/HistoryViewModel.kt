package com.meruberte.urticdiary.ui.screens.history

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meruberte.urticdiary.data.repository.DailyEntryRepository
import com.meruberte.urticdiary.domain.model.DailyEntry
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HistoryViewModel @Inject  constructor(
    private val repository: DailyEntryRepository
) : ViewModel() {

    private val _entries = MutableStateFlow<List<DailyEntry>>(emptyList())
    val entries: StateFlow<List<DailyEntry>> = _entries

    init {
        viewModelScope.launch {
            repository.getAllEntries().collect { list ->
                _entries.value = list
            }
        }
    }
}