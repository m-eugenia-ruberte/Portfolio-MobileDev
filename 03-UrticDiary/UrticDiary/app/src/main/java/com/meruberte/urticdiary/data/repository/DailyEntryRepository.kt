package com.meruberte.urticdiary.data.repository

import com.meruberte.urticdiary.data.local.DailyEntryDao
import com.meruberte.urticdiary.domain.model.DailyEntry
import kotlinx.coroutines.flow.Flow

class DailyEntryRepository(private val dao: DailyEntryDao) {
    suspend fun insert(entry: DailyEntry) = dao.insertEntry(entry)

    fun getAllEntries(): Flow<List<DailyEntry>> = dao.getAllEntries()

    suspend fun clearAll() = dao.clearAll()
}