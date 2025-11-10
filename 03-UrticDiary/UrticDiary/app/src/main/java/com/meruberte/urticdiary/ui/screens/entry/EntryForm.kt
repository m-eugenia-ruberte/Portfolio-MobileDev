package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EntryForm(
    onSave: (Int, Int, String)-> Unit
){
    var hivesLevel by remember { mutableStateOf(0) }
    var itchLevel by remember { mutableStateOf(0) }
    var notes by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        Text(
            "Registrar síntomas del día",
            style = MaterialTheme.typography.titleLarge
        )
        SymptomLevelSelector(
            label = "Nivel de ronchas",
            levels = listOf("Ninguna", "<20", "21-50", ">50"),
            selectedIndex = hivesLevel,
            onLevelSelected = { hivesLevel = it}
        )
        SymptomLevelSelector(
            label = "Nivel de picor",
            levels = listOf("Ninguno", "Leve", "Moderado", "Intenso"),
            selectedIndex = itchLevel,
            onLevelSelected = { itchLevel = it}
        ) 
        OutlinedTextField(
            value = notes,
            onValueChange = {notes = it},
            label = {Text("Notas")},
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = { onSave(hivesLevel, itchLevel, notes)},
            modifier = Modifier.fillMaxWidth()
        ){
            Text("Guardar")
        }
    }
}