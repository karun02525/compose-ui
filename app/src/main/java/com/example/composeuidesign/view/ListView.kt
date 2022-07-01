package com.example.composeuidesign.view

import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

class ListView {

    @OptIn(ExperimentalFoundationApi::class)
    @Composable
    fun ListOfLanguage() {
        var colors by remember {
            mutableStateOf(
                listOf(
                    "red",
                    "blue",
                    "green",
                    "pink",
                    "Yellow",
                    "White"
                )
            )
        }

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(items = colors, key = { it }) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray.copy(alpha = 0.2f))
                        .padding(24.dp)
                        .animateItemPlacement(
                            animationSpec = tween(
                                durationMillis = 600
                            )
                        ),
                    text = "I love $it",
                    fontWeight = FontWeight.Bold,
                    fontSize = MaterialTheme.typography.h5.fontSize
                )
            }
            item{
              Button(
                  modifier = Modifier.fillMaxWidth().padding(24.dp),
                  onClick = { colors=colors.shuffled() }) {
                  
                  Text(text = "Shuffle")
                  
              }
            }
        }
    }
}