package com.meruberte.urticdiary.ui.screens.settings

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.meruberte.urticdiary.data.repository.SettingsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val repository: SettingsRepository
) : ViewModel() {

    // Exponer la hora y minuto del recordatorio como StateFlow
    val reminderHour: StateFlow<Int> = repository.dailyReminderHourFlow
        .stateIn(viewModelScope, SharingStarted.Lazily, 9) // valor por defecto
    val reminderMinute: StateFlow<Int> = repository.dailyReminderMinuteFlow
        .stateIn(viewModelScope, SharingStarted.Lazily, 0)

    // Funciones para actualizar los valores
    fun updateReminderHour(hour: Int) = viewModelScope.launch {
        repository.updateReminderHour(hour)
    }

    fun updateReminderMinute(minute: Int) = viewModelScope.launch {
        repository.updateReminderMinute(minute)
    }
}
