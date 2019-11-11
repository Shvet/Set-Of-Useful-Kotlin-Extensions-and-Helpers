package com.crazylegend.kotlinextensions.dateAndTime

import java.util.*
import java.util.concurrent.TimeUnit


/**
 * Created by hristijan on 3/20/19 to long live and prosper !
 */

fun timeAsMillis(hours: Int, minutes: Int, seconds: Int): Long {
    return TimeUnit.HOURS.toMillis(hours.toLong()) +
            TimeUnit.MINUTES.toMillis(minutes.toLong()) +
            TimeUnit.SECONDS.toMillis(seconds.toLong())
}



fun extractHours(millis: Long): Long {
    return millis / (1000 * 60 * 60)
}

fun extractMinutes(millis: Long): Long {
    return millis / (1000 * 60) % 60
}

fun extractSeconds(millis: Long): Long {
    return millis / 1000 % 60
}


private val millis
    get() = System.currentTimeMillis()

val unixTime
    get() = currentDate.unixTime


val currentCalendar: Calendar
    get() = Calendar.getInstance()

val Date.unixTime
    get() = time / 1000

