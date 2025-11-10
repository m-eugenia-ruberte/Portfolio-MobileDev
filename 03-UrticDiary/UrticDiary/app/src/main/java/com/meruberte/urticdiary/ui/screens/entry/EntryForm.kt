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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun EntryForm(
    hivesLevel: Int,
    itchLevel: Int,
    notes: String,
    onHivesLevelChange: (Int) -> Unit,
    onItchLevelChange: (Int) -> Unit,
    onNotesChange: (String) -> Unit,
    onSave: ()-> Unit,
    saved: Boolean,
    onReset: () -> Unit
){
    var showConfirmation by remember { mutableStateOf(false) }

    LaunchedEffect(saved) {
        if(saved){
            showConfirmation = true
            onReset()
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ){
        if (showConfirmation) {
            Text(
                text = "Registro guardado correctamente ✅",
                color = MaterialTheme.colorScheme.primary
            )
        }
        else{
            Text(
                "Registrar síntomas del día",
                style = MaterialTheme.typography.titleLarge
            )
        }
        SymptomLevelSelector(
            label = "Nivel de ronchas",
            levels = listOf("Ninguna", "<20", "21-50", ">50"),
            selectedIndex = hivesLevel,
            onLevelSelected = onHivesLevelChange
        )
        SymptomLevelSelector(
            label = "Nivel de picor",
            levels = listOf("Ninguno", "Leve", "Moderado", "Intenso"),
            selectedIndex = itchLevel,
            onLevelSelected = onItchLevelChange
        )
        OutlinedTextField(
            value = notes,
            onValueChange = onNotesChange,
            label = {Text("Notas")},
            modifier = Modifier.fillMaxWidth()
        )
        Button(
            onClick = onSave,
            modifier = Modifier.fillMaxWidth()
        ){
            Text("Guardar")
        }
    }
}