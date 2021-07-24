package com.example.hackerranksolutions.algorithms
import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix arr is shown below:
1 2 3
4 5 6
9 8 9
The left-to-right diagonal = 1 + 5 + 9 = 15.
The right to left diagonal = 3 + 5 + 9 = 17.
Their absolute difference is |15-7|=2

Function description
Complete the  function in the editor below.
diagonalDifference takes the following parameter:
int arr[n][m]: an array of integers
Return
int: the absolute diagonal difference
Input Format
The first line contains a single integer, n,the number of rows and columns in the square matrix arr.
Each of the next n lines describes a row, arr[i] , and consists of n space-separated integers arr[i][j].
Constraints
-100<=arr[i][j]<=100
Output Format
Return the absolute difference between the sums of the matrix's two diagonals as a single integer.
*/


fun diagonalDifference(arr: Array<Array<Int>>): Int {

    var primary = 0
    var secondry = 0

    for (i in 0..(arr.size - 1)) {
        primary += arr[i][i]
        for (j in 0..(arr.size - 1)) {

            if ((i + j) == (arr.size - 1)) {
                secondry += arr[i][j]
            }
        }
    }
    return Math.abs(primary - secondry)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
