package com.example.hackerranksolutions.algorithms
/*Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Example
 s ='12:01:00PM'
 Return '12:01:00'

 s='12:01:00AM'
 Return '00:01:00'

 Function Description
Complete the timeConversion function in the editor below. It should return a new string representing
the input time in 24 hour format.

timeConversion has the following parameter(s):
string s: a time in 24 hour format

Returns
string: the time in  hour format

Input Format
A single string s that represents a time in 12-hour clock format*/

fun timeConversion(s: String): String {
    val arr = s.split(":")
    val isAM = s.contains("AM")
    val hour = arr[0].toInt()
    val min = arr[1]
    val sec = arr[2].substring(0,2)

    return when{
        hour == 12 && isAM -> "00:$min:$sec"
        !isAM -> "${12 + (hour%12)}:$min:$sec"
        else -> s.substring(0,s.length-2)
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}