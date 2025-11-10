package com.meruberte.urticdiary.ui.screens.history

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.meruberte.urticdiary.data.repository.DailyEntryRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HistoryScreen(
    repository: DailyEntryRepository,
    viewModel: HistoryViewModel = viewModel(factory = HistoryViewModelFactory(repository))
){
    val entries by viewModel.entries.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Historial de registros") })
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .padding(padding)
                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            if(entries.isEmpty()){
                item {
                    Text("No hay registros guardados aún.")
                }
            }else{
                items(entries){ entry ->
                    HistoryItem(entry)
                }
            }
        }

    }
}