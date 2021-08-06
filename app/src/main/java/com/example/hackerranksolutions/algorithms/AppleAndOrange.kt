package com.example.hackerranksolutions.algorithms

/*
Sam's house has an apple tree and an orange tree that yield an abundance of fruit. Using the information given below,
determine the number of apples and oranges that land on Sam's house.

In the diagram below:

The red region denotes the house, where s is the start point, and t is the endpoint. The apple tree is to the left of
the house, and the orange tree is to its right. Assume the trees are located on a single point, where the apple tree is at point a,
and the orange tree is at point b.
When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis. *A negative value of d means the
fruit fell d units to the tree's left, and a positive value of  means it falls  units to the tree's right.

Given the value of d for m apples and n oranges, determine how many apples and oranges will fall on Sam's house
For example, Sam's house is between s=7 and t=10. The apple tree is located at a=4 and the orange b=12. There are m=3 apples and n=3 oranges.
Apples are thrown apples=[2,3,-4] units distance from a, and oranges=[3,-2,-4] units distance. Adding each apple distance to the position of the tree,
they land at [4+2,4+3,4+(-4)]=[6,7,0]. Oranges land at [12+3,12+(-12),12+(-4)]=[15,10,8]. One apple and two oranges land in the inclusive range 7-10 so we print
1
2

Function Description
Complete the countApplesAndOranges function in the editor below. It should print the number of apples and oranges that land on Sam's house, each on a separate line.

countApplesAndOranges has the following parameter(s):

s: integer, starting point of Sam's house location.
t: integer, ending location of Sam's house location.
a: integer, location of the Apple tree.
b: integer, location of the Orange tree.
apples: integer array, distances at which each apple falls from the tree.
oranges: integer array, distances at which each orange falls from the tree.

Input Format

The first line contains two space-separated integers denoting the respective values of s and t.
The second line contains two space-separated integers denoting the respective values of a and b.
The third line contains two space-separated integers denoting the respective values of m and n.
The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

Output Format

Print two integers on two different lines:
The first integer: the number of apples that fall on Sam's house.
The second integer: the number of oranges that fall on Sam's house.
 */


import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*


fun countApplesAndOranges(
    s: Int,
    t: Int,
    a: Int,
    b: Int,
    apples: Array<Int>,
    oranges: Array<Int>
): Unit {


    var appleCounter = 0
    var orangeCounter = 0

    for (apple in apples) {
        if ((a + apple >= s) && (apple + a <= t)) {
            appleCounter++
        }
    }
    for (orange in oranges) {
        if ((b + orange >= s) && (b + orange <= t)) {
            orangeCounter++
        }
    }

    println("$appleCounter\n$orangeCounter")


}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val s = first_multiple_input[0].toInt()

    val t = first_multiple_input[1].toInt()

    val second_multiple_input = readLine()!!.trimEnd().split(" ")

    val a = second_multiple_input[0].toInt()

    val b = second_multiple_input[1].toInt()

    val third_multiple_input = readLine()!!.trimEnd().split(" ")

    val m = third_multiple_input[0].toInt()

    val n = third_multiple_input[1].toInt()

    val apples = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val oranges = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    countApplesAndOranges(s, t, a, b, apples, oranges)
}

