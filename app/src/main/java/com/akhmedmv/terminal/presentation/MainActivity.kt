package com.akhmedmv.terminal.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.akhmedmv.terminal.ui.theme.TerminalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TerminalTheme {
                Terminal()
            }
        }
    }
}