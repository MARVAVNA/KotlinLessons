package arithmetic

import kotlin.math.pow

fun Int.totientImproved(): Int {
    val list = this.primeFactorMultiplicity()

    var phi = 1
    for ((index, value) in list) {
        phi *= (index - 1) * index.toDouble().pow(value - 1).toInt()
        println("${index - 1} * $index ^ ${value - 1}")
    }

    return phi
}

/*
fun <T> List<T>.tail(): List<T> = drop(1)

fun Int.totientImproved(): Int {
    fun totient(primeFactors: List<Pair<Int, Int>>): Double =
        if (primeFactors.isEmpty()) 1.0
        else {
            val (p, m) = primeFactors.first()
            (p - 1) * p.toDouble().pow(m.toDouble() - 1) * totient(primeFactors.tail())
        }
    return totient(this.primeFactorMultiplicity()).toInt()
}
*/

fun main() {
    println(315.totientImproved())
}