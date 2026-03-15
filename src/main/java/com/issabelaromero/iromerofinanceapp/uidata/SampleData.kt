package com.issabelaromero.iromerofinanceapp.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.Color
import com.issabelaromero.iromerofinanceapp.data.SummaryCard
import com.issabelaromero.iromerofinanceapp.data.Transaction
import com.issabelaromero.iromerofinanceapp.data.User

val sampleUser = User(
    name = "Issabela",
    balance = 5000.0
)

val summaryCards = listOf(

    SummaryCard("Actividad", 0.0, Color(0xFFDCE8E3)),
    SummaryCard("Ventas", 280.99, Color(0xFFE9D8C8)),
    SummaryCard("Ganancias", 280.99, Color(0xFFDAD5EB))

)

val transactions = listOf(

    Transaction("Supermarket", "Groceries", 45.99, "10:30 AM", Icons.Default.ShoppingCart),
    Transaction("Gas Station", "Fuel", -30.5, "12:15 PM", Icons.Default.ShoppingCart),
    Transaction("Coffee Shop", "Food & Drinks", 5.75, "8:00 AM", Icons.Default.ShoppingCart),
    Transaction("Electronics Store", "Electronics", 120.0, "3:45 PM", Icons.Default.ShoppingCart),
    Transaction("Bookstore", "Books", 25.99, "2:00 PM", Icons.Default.ShoppingCart),
    Transaction("Restaurant", "Dining", 60.0, "7:30 PM", Icons.Default.ShoppingCart)

)