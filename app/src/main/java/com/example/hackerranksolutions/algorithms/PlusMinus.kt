package com.example.hackerranksolutions.algorithms
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*
/*Given an array of integers, calculate the ratios of its elements that are positive, negative,
and zero. Print the decimal value of each fraction on a new line with 6 places after the decimal.
Note: This challenge introduces precision problems. The test cases are scaled to six decimal places,
though answers with absolute error of up to 10^(-4) are acceptable.

Example
arr[1,1,0-1,-1]
There are n=5 elements, two positive, two negative and one zero. Their ratios are 2/5=0.400000, 2/5=0.400000
and 1/5=0.200000. Results are printed as:
0.400000
0.400000
0.200000

Function Description
Complete the plusMinus function in the editor below.
plusMinus has the following parameter(s):
int arr[n]: an array of integers

Print
Print the ratios of positive, negative and zero values in the array. Each value should be printed on a separate
line with 6 digits after the decimal. The function should not return a value.

Input Format
The first line contains an integer, n,the size of the array.
The second line contains n space-separated integers that describe arr[n].

Output Format
Print the following 3 lines, each to 6 decimals:
proportion of positive values
proportion of negative values
proportion of zeros
*/

fun plusMinus(arr: Array<Int>): Unit {

    var s = 0F
    var p = 0F
    var k = 0F

    for(i in 0..(arr.size-1)){

        if(arr[i]>0){
            s++
        }
        else if(arr[i]<0){
            p++
        }
        else{
            k++
        }
    }
    println(s / arr.size)
    println(p / arr.size)
    println(k / arr.size)

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
