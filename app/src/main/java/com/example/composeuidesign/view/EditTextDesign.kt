package com.example.composeuidesign.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class EditTextDesign {


    
    
    
    @Composable
    fun StateHoistingEditText() {
        
        Column(modifier = Modifier.padding(30.dp)) {
            
            var txtMessage = remember { mutableStateOf("") }
            Text(text = "Hello, ${txtMessage.value}")
            
            OutlinedTextField(value =txtMessage.value , onValueChange = {
                txtMessage.value=it
            },
                placeholder = {
                    Text(text = "Enter any text")
                }
            
                )
            
        }
        
    }



}