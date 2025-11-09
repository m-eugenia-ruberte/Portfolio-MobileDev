package com.meruberte.urticdiary

import android.app.Application
import androidx.room.Room
import com.meruberte.urticdiary.data.local.UrticDiaryDatabase
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

class UrticDiaryApp : Application() {
    override fun onCreate() {
        super.onCreate()

    }
}