package com.example.hackerranksolutions.algorithms
import kotlin.io.*
import kotlin.text.*

/* Staircase detail
This is a staircase of size n= 4
   #
  ##
 ###
####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Function Description

Complete the staircase function in the editor below.

staircase has the following parameter(s):

int n: an integer
Print

Print a staircase as described above.

Input Format

A single integer, , denoting the size of the staircase.
*/



/*
 * Complete the 'staircase' function below.
 *
 * The function accepts INTEGER n as parameter.
 */

fun staircase(n: Int): Unit {

    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i)) //repeat()... love you darlin
    }

}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    staircase(n)
}

