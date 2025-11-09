package com.meruberte.urticdiary.domain.model

data class DailyEntry(
    val id: Int = 0,
    val date: String = "",
    val hivesLevel: Int = 0,
    val itchLevel: Int = 0,
    val notes: String? = null,
    val photoPath: String? = null
)