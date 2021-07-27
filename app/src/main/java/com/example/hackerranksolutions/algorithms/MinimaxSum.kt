package com.example.hackerranksolutions.algorithms
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
Then print the respective minimum and maximum values as a single line of two space-separated long integers.
Example
arr=[1,3,5,7,9]
The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24.
The function prints
16 24
Function Description
Complete the miniMaxSum function in the editor below.
miniMaxSum has the following parameter(s):
arr: an array of 5 integers

Print
Print two space-separated integers on one line: the minimum sum and the maximum sum of  of  elements.

Input Format
A single line of five space-separated integers.
Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly
four of the five integers. (The output can be greater than a 32 bit integer.)
 */

fun miniMaxSum(arr: Array<Int>): Unit {

    var min = arr[0]
    var max = arr[0]
    var sum = arr[0].toLong()


    for(i in 1 until arr.size){
        sum += arr[i]

        if(min > arr[i]){
            min = arr[i]
        }
        else if(max < arr[i]){
            max = arr[i]
        }
    }

    print("${sum-max}" + " " + "${sum - min}")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}

