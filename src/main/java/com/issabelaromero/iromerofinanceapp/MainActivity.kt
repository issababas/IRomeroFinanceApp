package com.issabelaromero.iromerofinanceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.issabelaromero.iromerofinanceapp.screens.HomeScreen
import com.issabelaromero.iromerofinanceapp.ui.theme.IRomeroFinanceAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            IRomeroFinanceAppTheme {

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HomeScreen(
                        modifier = Modifier.padding(innerPadding)
                    )

                }

            }

        }
    }
}