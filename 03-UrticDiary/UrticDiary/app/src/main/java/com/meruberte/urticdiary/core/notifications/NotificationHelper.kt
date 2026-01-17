package com.meruberte.urticdiary.core.notifications

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.annotation.RequiresPermission
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.meruberte.urticdiary.R
import com.meruberte.urticdiary.core.ReminderConstants
import com.meruberte.urticdiary.ui.MainActivity

object NotificationHelper {

    fun createNotificationChannel(context: Context) {
        val channel = NotificationChannel(
            ReminderConstants.CHANNEL_ID,
            ReminderConstants.CHANNEL_NAME,
            NotificationManager.IMPORTANCE_DEFAULT
        ).apply {
            description = "Recordatorio diario para registrar síntomas"
        }

        val manager =
            context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.createNotificationChannel(channel)
    }

    @RequiresPermission(Manifest.permission.POST_NOTIFICATIONS)
    fun showDailyReminder(context: Context) {
        val intent = Intent(context, MainActivity::class.java)

        val pendingIntent = PendingIntent.getActivity(
            context,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )

        val notification = NotificationCompat.Builder(context, ReminderConstants.CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_notification) // luego lo creamos
            .setContentTitle("Registro diario")
            .setContentText("¿Cómo ha sido tu día con la urticaria?")
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .build()

        NotificationManagerCompat.from(context)
            .notify(ReminderConstants.NOTIFICATION_ID, notification)
    }
}
