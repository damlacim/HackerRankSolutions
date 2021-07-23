package com.example.hackerranksolutions.algorithms
import java.util.*

/* Complete the function solveMeFirst to compute the sum of two integers.
Difficulty : Easy
* Example:
* a=7
* b=3
* Function Description
* Complete the solveMeFirst function in the editor below.

solveMeFirst has the following parameters:

int a: the first value
int b: the second value
Returns
* int: the sum of a and b
* Sample Input
* a=2
* b=3
* Sample Output
* 5 */

fun solveMeFirst(a: Int, b: Int): Int {

    return a+b
}

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val num1 = sc.nextInt()
    val num2 = sc.nextInt()
    val sum = solveMeFirst(num1, num2)
    println(sum)
}