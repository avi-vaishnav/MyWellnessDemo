package com.example.mywellnessdemo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    var count = 0

    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "You've had $count glasses")
        Button(onClick = { count++ }, modifier = Modifier.padding(top = 8.dp)) {
            Text(text = "Add One")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    WaterCounter(modifier = Modifier.padding(16.dp))
}