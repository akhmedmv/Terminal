package com.akhmedmv.terminal.presentation

import com.akhmedmv.terminal.data.Bar

sealed class TerminalScreenState {
    object Initial : TerminalScreenState()
    data class Content(val barList: List<Bar>) : TerminalScreenState()
}