package com.example.hackerranksolutions.algorithms
import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*
/*Given an array of integers, find the sum of its elements.
For example, if the array
ar=[1,2,3], 1+2+3=6, so return 6
Function Description
Complete the simpleArraySum function in the editor below. It must return the sum of the array elements as an integer.
simpleArraySum has the following parameter(s):
ar: an array of integers
Input Format
The first line contains an integer,n ,denoting the size of the array.
The second line contains n space-separated integers representing the array's elements.
Constraints
0< n,ar[i] <= 1000
Output Format
Print the sum of the array's elements as a single integer.
Sample Input
6
1 2 3 4 10 11
Sample Output
31*/

fun simpleArraySum(ar: Array<Int>): Int {
    var sum = 0
    for(i in 0..(ar.size-1)){
        sum +=ar[i]
    }
return sum
}

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = simpleArraySum(ar)

    println(result)
}


