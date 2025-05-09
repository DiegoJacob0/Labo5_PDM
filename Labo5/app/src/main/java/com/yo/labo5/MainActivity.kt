package com.yo.labo5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.yo.labo5.ViewModel.GeneralViewModel
import com.yo.labo5.ui.theme.Labo5Theme
import com.yo.labo5.Screen.TODOScreen

class MainActivity : ComponentActivity() {

    private val viewModel: GeneralViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Labo5Theme {
                TODOScreen(viewModel = viewModel)
            }
        }
    }
}
