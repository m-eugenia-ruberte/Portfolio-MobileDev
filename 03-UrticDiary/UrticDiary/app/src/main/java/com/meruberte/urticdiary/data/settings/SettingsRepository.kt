package com.meruberte.urticdiary.data.repository

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.meruberte.urticdiary.core.ReminderSettingsConstants
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SettingsRepository @Inject constructor(
    private val dataStore: DataStore<Preferences>
) {
    val dailyReminderHourFlow: Flow<Int> = dataStore.data
        .map { it[ReminderSettingsConstants.DAILY_REMINDER_HOUR] ?: 9 }

    val dailyReminderMinuteFlow: Flow<Int> = dataStore.data
        .map { it[ReminderSettingsConstants.DAILY_REMINDER_MINUTE] ?: 0 }

    suspend fun updateReminderHour(hour: Int) {
        dataStore.edit { it[ReminderSettingsConstants.DAILY_REMINDER_HOUR] = hour }
    }

    suspend fun updateReminderMinute(minute: Int) {
        dataStore.edit { it[ReminderSettingsConstants.DAILY_REMINDER_MINUTE] = minute }
    }
}
