package arithmetic

fun listPrimesInRange(range: IntRange): List<Int> {
    if (range.isEmpty()) throw NoSuchElementException("This range is empty")
    val list: MutableList<Int> = mutableListOf()
    for (i in range) {
        if (i.isPrime()) {
            list.add(i)
        }
    }

    return list.toList()
}

fun main() {
    println(listPrimesInRange(7..31))
}