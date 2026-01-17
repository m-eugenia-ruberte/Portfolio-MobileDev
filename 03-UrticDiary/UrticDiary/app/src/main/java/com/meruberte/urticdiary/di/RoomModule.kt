
package com.meruberte.urticdiary.di

import android.content.Context
import androidx.room.Room
import com.meruberte.urticdiary.core.AppConstants
import com.meruberte.urticdiary.data.local.DailyEntryDao
import com.meruberte.urticdiary.data.local.UrticDiaryDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context
    ): UrticDiaryDatabase {
        return Room.databaseBuilder(
            context,
            UrticDiaryDatabase::class.java,
            AppConstants.DATABASE_NAME
        ).build()
    }

    @Provides
    fun provideDailyEntryDao(
        database: UrticDiaryDatabase
    ): DailyEntryDao {
        return database.dailyEntryDao()
    }
}
