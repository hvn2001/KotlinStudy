// https://dzone.com/articles/exercises-in-kotlin-part-2-high-level-syntax-and-v
package com.example.kotlin.learning
fun gcd(a: Int, b: Int): Int {
    if (a == 0) {
        return b
    }
    return gcd(b % a, a)
}

fun gcdSol(a: Int, b: Int): Int {
    if (a == 0) {
        return b
    }
    return gcdSol(b % a, a)
}

fun lcm(a: Int, b: Int): Long = a.toLong() * b / gcd(a, b)

fun join(strings: Collection<String>, delimiter: String = ", ") = strings.joinToString(delimiter)

fun main(args: Array<String>) {
    println(gcd(54, 24))

    println(gcdSol(54, 24))
    println(gcdSol(81, 153))
    println(gcdSol(137, 73))

    println(lcm(54, 1))
    println(lcm(1, 24))
    println(lcm(3, 7))

    val planets = listOf("Saturn", "Jupiter", "Earth", "Uranus")


    val joined1 = join(planets, delimiter = " - ")
    val joined2 = join(strings = planets)
    val joined3 = join(strings = planets, delimiter = " - ")
    val joined4 = join(delimiter = ", ", strings = planets)

    println(joined1)
    println(joined2)
    println(joined3)
    println(joined4)
}