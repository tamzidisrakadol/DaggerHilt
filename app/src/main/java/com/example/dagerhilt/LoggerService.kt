package com.example.dagerhilt

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun log(message: String) {
        Log.d("tag", "this is $message from logger service")
    }
}