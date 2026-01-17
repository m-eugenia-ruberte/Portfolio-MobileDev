package com.meruberte.urticdiary.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.meruberte.urticdiary.core.AppConstants
import com.meruberte.urticdiary.domain.model.DailyEntry
@Database(entities = [DailyEntry::class], version = 1, exportSchema = false)
abstract class UrticDiaryDatabase : RoomDatabase() {

    abstract fun dailyEntryDao(): DailyEntryDao

    companion object {
        @Volatile
        private var INSTANCE: UrticDiaryDatabase? = null

        fun getDatabase(context: Context): UrticDiaryDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UrticDiaryDatabase::class.java,
                    AppConstants.DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}