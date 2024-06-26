/*
 * Copyright (c) 2024 Ian Warwick
 * Released under the MIT license
 * https://opensource.org/licenses/MIT
 */

package com.fluxtah.askpluginsdk.io

fun getCurrentWorkingDirectory(): String {
    return System.getProperty("user.dir")
}