package com.meruberte.urticdiary.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.meruberte.urticdiary.domain.model.DailyEntry

@Database(entities = [DailyEntry::class], version = 1, exportSchema = false)
abstract class UrticDiaryDatabase: RoomDatabase(){
    abstract fun dailyEntryDao(): DailyEntryDao
}

