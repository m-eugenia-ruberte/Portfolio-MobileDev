import android.content.Context
import androidx.work.*
import com.meruberte.urticdiary.core.Constants
import com.meruberte.urticdiary.core.notifications.DailyReminderWorker
import com.meruberte.urticdiary.core.notifications.NotificationHelper
import com.meruberte.urticdiary.core.notifications.NotificationPermissionHelper
import java.util.Calendar
import java.util.concurrent.TimeUnit

object ReminderScheduler {

    fun scheduleDailyReminder(context: Context) {

        if (!NotificationPermissionHelper.hasPermission(context)) return
        NotificationHelper.createNotificationChannel(context)

        val now = Calendar.getInstance()
        val scheduledTime = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, 20) // ⏰ hora fija MVP
            set(Calendar.MINUTE, 0)
            set(Calendar.SECOND, 0)
        }

        if (scheduledTime.before(now)) {
            scheduledTime.add(Calendar.DAY_OF_YEAR, 1)
        }

        val initialDelay =
            scheduledTime.timeInMillis - now.timeInMillis

        val workRequest =
            PeriodicWorkRequestBuilder<DailyReminderWorker>(1, TimeUnit.DAYS)
                .setInitialDelay(initialDelay, TimeUnit.MILLISECONDS)
                .build()

        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            Constants.WORK_NAME,
            ExistingPeriodicWorkPolicy.KEEP,
            workRequest
        )
    }
}
