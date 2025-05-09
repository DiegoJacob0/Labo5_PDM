package com.yo.labo5.Model

import java.util.Date


data class Task (
    val id: Int,
    val title: String,
    val description: String,
    val endDate: Date = Date(),
    val isCompleted: Boolean = false
)

