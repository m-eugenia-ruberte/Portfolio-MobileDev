package com.meruberte.urticdiary

import android.app.Application
import androidx.room.Room
import com.meruberte.urticdiary.data.local.UrticDiaryDatabase
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

class UrticDiaryApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // Aquí puedes inicializar librerías globales (Hilt, Room, logging, etc.)
        val db = Room.databaseBuilder(
            applicationContext,
            UrticDiaryDatabase::class.java,
            "urtic_diary_db"
        ).build()

        val dao = db.dailyEntryDao()
        val repository = DailyEntryRepository(dao)
    }
}