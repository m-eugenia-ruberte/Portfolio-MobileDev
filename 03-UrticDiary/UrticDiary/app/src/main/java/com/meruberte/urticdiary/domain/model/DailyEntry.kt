package com.meruberte.urticdiary.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "daily_entries")
data class DailyEntry(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val date: String = "",
    val hivesLevel: Int = 0,
    val itchLevel: Int = 0,
    val notes: String? = null,
    val photoPath: String? = null
)