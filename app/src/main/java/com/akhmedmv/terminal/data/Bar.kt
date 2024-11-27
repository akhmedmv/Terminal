package com.akhmedmv.terminal.data

import android.icu.util.Calendar
import android.os.Parcelable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import com.akhmedmv.terminal.presentation.TerminalState
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.Date

@Parcelize
@Immutable
data class Bar(
    @SerializedName("o") val open: Float,
    @SerializedName("c") val close: Float,
    @SerializedName("l") val low: Float,
    @SerializedName("h") val high: Float,
    @SerializedName("t") val time: Long,
) : Parcelable {
    val calendar: Calendar
        get() {
            return Calendar.getInstance().apply {
                time = Date(this@Bar.time)
            }
        }
}

@Composable
fun rememberTerminalState(bars: List<Bar>): MutableState<TerminalState> {
    return rememberSaveable {
        mutableStateOf(TerminalState(bars))
    }
}
