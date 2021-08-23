package arithmetic

fun Int.goldbach(): Pair<Int, Int> {
    for (i in 1 until this)
        if (i.isPrime() && (this - i).isPrime())
            return i to this - i

    throw IllegalStateException()
}

/*fun Int.goldbach(): Pair<Int, Int> {
    if (this == 2) return Pair(1, 1)
    if (this == 3) return Pair(1, 2)
    val prime = listPrimesInRange(2 until this).find { (this - it).isPrime() } ?: throw IllegalStateException()
    return Pair(prime, this - prime)
}*/

fun main() {
    println(28.goldbach())
}