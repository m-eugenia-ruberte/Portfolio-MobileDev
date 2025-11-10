package com.meruberte.urticdiary.ui.screens.entry

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SymptomLevelSelector(
    label: String,
    levels: List<String>,
    selectedIndex: Int,
    onLevelSelected: (Int) -> Unit
){
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        Text(label, style = MaterialTheme.typography.titleMedium)

        levels.forEachIndexed { index, level ->
            Row(
               verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 8.dp)
            ){
                RadioButton(
                    selected = selectedIndex == index,
                    onClick = { onLevelSelected(index)}
                )
                Text(level)
            }
        }
    }
}