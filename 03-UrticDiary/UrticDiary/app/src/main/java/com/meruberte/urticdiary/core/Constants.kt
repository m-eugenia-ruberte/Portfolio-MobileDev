package com.meruberte.urticdiary.core

import androidx.datastore.preferences.core.intPreferencesKey

object AppConstants {
    // Base App
    const val DATABASE_NAME = "urtic_diary_db"
}
//Constantes de recordatorio
object ReminderConstants {
    const val CHANNEL_ID = "daily_reminder_channel"
    const val CHANNEL_NAME = "Recordatorio diario"
    const val WORK_NAME = "daily_reminder_work"
    const val NOTIFICATION_ID = 1001
}

// Constantes de configuración / preferencias del recordatorio
object ReminderSettingsConstants {
    const val SETTINGS_NAME = "settings_prefs"
    val DAILY_REMINDER_HOUR = intPreferencesKey("daily_reminder_hour")
    val DAILY_REMINDER_MINUTE = intPreferencesKey("daily_reminder_minute")
}