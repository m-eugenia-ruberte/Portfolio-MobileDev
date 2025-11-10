package com.meruberte.urticdiary.ui.screens.history

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.meruberte.urticdiary.domain.model.DailyEntry

@Composable
fun HistoryItem(entry: DailyEntry){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ){
        Column(modifier = Modifier.padding(16.dp)) {
            Text(entry.date, style = MaterialTheme.typography.labelLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text("Ronchas: ${entry.hivesLevel}")
            Text("Picor: ${entry.itchLevel}")
            val notes = entry.notes ?: ""
            if (notes.isNotEmpty()){
                Spacer(modifier = Modifier.height(8.dp))
                Text("Notas: ${entry.notes}")
            }
        }
    }
}