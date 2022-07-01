package com.example.composeuidesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.composeuidesign.ui.theme.ComposeUiDesignTheme
import com.example.composeuidesign.view.EditTextDesign
import com.example.composeuidesign.view.ListView
import com.example.composeuidesign.view.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUiDesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                  //  LoginScreen().LoginUi()
                   // EditTextDesign().StateHoistingEditText()
                    ListView().ListOfLanguage()
                }
            }
        }
    }

}