package arithmetic

fun Int.primeFactors(): List<Int> {
    if (this.isPrime()) return listOf(this)

    var num = this
    val list: MutableList<Int> = mutableListOf()
    for (i in 2..this / 2) {
        if (i.isPrime()) {
            while (num % i == 0) {
                num /= i
                list.add(i)
            }
        }
    }
    return list.toList()
}

/*fun Int.primeFactors(): List<Int> {
    if (this.isPrime()) return listOf(this)

    val primeFactor = (2..(this / 2))
        .filter { it.isPrime() }
        .find { this % it == 0 }

    return if (primeFactor == null) emptyList()
    else listOf(primeFactor) + (this / primeFactor).primeFactors()
}*/

fun main() {
    println(12220.primeFactors())
}