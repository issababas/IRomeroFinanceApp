package com.issabelaromero.iromerofinanceapp.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.issabelaromero.iromerofinanceapp.components.SummaryCardItem
import com.issabelaromero.iromerofinanceapp.components.TransactionItem
import com.issabelaromero.iromerofinanceapp.ui.sampleUser
import com.issabelaromero.iromerofinanceapp.ui.summaryCards
import com.issabelaromero.iromerofinanceapp.ui.transactions
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Column {

                Text(
                    text = "Hola ${sampleUser.name}",
                    fontSize = 24.sp
                )

                Text(
                    text = "Bienvenido de nuevo",
                    fontSize = 14.sp,
                    color = Color.Gray
                )

            }

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null
            )

        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            summaryCards.forEach {

                SummaryCardItem(it)

            }

        }

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Text("Transactions")

            Text("See All")

        }

        LazyColumn {

            items(transactions) {

                TransactionItem(it)

            }

        }
    }
}