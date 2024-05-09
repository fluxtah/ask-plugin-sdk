package com.fluxtah.askpluginsdk.logging

class AskLogger {
    private var logLevel = LogLevel.OFF

    fun setLogLevel(level: LogLevel) {
        logLevel = level
    }

    fun log(level: LogLevel, message: String) {
        if (logLevel == LogLevel.OFF) {
            return
        }

        if (level >= logLevel) {
            println("[$level] $message")
        }
    }
}