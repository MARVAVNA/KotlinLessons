package arithmetic

fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>> {
    if (this.isPrime()) return listOf(this to 1)

    var num = this
    val list: MutableList<Pair<Int, Int>> = mutableListOf()
    var count = 0
    for (i in 2..this / 2) {
        if (i.isPrime()) {
            count = 0
            while (num % i == 0) {
                num /= i
                count++
            }
            if (count != 0) list.add(i to count)
        }
    }

    return list.toList()
}

/*
fun Int.primeFactorMultiplicity(): List<Pair<Int, Int>> =
    this.primeFactors()
        .groupBy { it }
        .map { Pair(it.key, it.value.size) }
*/

fun main() {
    println(1790.primeFactorMultiplicity())
}