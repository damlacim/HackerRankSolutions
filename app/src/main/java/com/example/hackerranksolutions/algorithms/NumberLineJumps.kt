package com.example.hackerranksolutions.algorithms
import kotlin.io.*
import kotlin.text.*
/* You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to
jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location at the same time as part of the show. If it is possible, return YES, otherwise return NO.

Example

x1 = 2
v1 = 1
x2 = 1
v2 = 2
After one jump, they are both at x=3 , (x1+v1=2+1, x2+v2=1+2), so the answer is YES.

Function Description

Complete the function kangaroo in the editor below.

kangaroo has the following parameter(s):

int x1, int v1: starting position and jump distance for kangaroo 1
int x2, int v2: starting position and jump distance for kangaroo 2
Returns

string: either YES or NO

Input Format
A single line of four space-separated integers denoting the respective values x1,v1,x2 and v2.

Sample Input 0
0 3 4 2
Sample Output 0
YES

!!Formulation!!

Kangaroo position = (Number of jumps * Distance per Jump) + Starting position.
      K = (y * v) + x

For kangaroos to meet, their positions must be equal.

(y * v1) + x1 = (y * v2) + x2

(x1 - x2) / (v2 - v1) = y

If the second kangaroo is faster (v2 > v1), the first kangaroo will never catch it.
so the condition:

v2 < v1

The code below is how we validate that the point of intersection is a whole number.

(x1 - x2) % (v2 - v1) == 0

*/

fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    var response : String = "NO"
    if(v2 < v1){
        if((x1 - x2) % (v2 - v1) == 0){
            response = "YES"
        }
    }
    return response
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}

