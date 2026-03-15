package com.issabelaromero.iromerofinanceapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.issabelaromero.iromerofinanceapp.data.Transaction

@Composable
fun TransactionItem(transaction: Transaction) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(45.dp)
                .clip(CircleShape)
                .background(Color(0xFFEDEDED)),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = transaction.icon,
                contentDescription = null
            )

        }

        Spacer(modifier = Modifier.width(12.dp))

        Column(modifier = Modifier.weight(1f)) {

            Text(
                text = transaction.store,
                fontSize = 16.sp
            )

            Text(
                text = transaction.category,
                fontSize = 12.sp,
                color = Color.Gray
            )

        }

        Column(horizontalAlignment = Alignment.End) {

            Text(
                text = "$${transaction.amount}",
                fontSize = 16.sp
            )

            Text(
                text = transaction.time,
                fontSize = 12.sp,
                color = Color.Gray
            )

        }
    }
}