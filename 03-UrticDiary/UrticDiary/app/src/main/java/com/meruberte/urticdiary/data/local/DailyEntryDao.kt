package com.meruberte.urticdiary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.meruberte.urticdiary.domain.model.DailyEntry
import kotlinx.coroutines.flow.Flow

@Dao
interface DailyEntryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertEntry(entry: DailyEntry)

    @Query("SELECT * FROM daily_entries ORDER BY date DESC")
    fun getAllEntries(): Flow<List<DailyEntry>>

    @Query("DELETE FROM daily_entries")
    suspend fun clearAll()
}