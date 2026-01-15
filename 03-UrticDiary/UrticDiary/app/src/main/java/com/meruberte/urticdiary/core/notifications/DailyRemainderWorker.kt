package com.meruberte.urticdiary.core.notifications

import android.Manifest
import android.content.Context
import androidx.annotation.RequiresPermission
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class DailyReminderWorker(
    context: Context,
    params: WorkerParameters
) : CoroutineWorker(context, params) {

    @RequiresPermission(Manifest.permission.POST_NOTIFICATIONS)
    override suspend fun doWork(): Result {
        NotificationHelper.showDailyReminder(applicationContext)
        return Result.success()
    }
}
