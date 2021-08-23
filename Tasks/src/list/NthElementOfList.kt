package list

fun <T> nthElementOfList(list: List<T>, index: Int): T {
    if (list.isEmpty()) throw NoSuchElementException()

    if (index > list.lastIndex || index < 0) throw IndexOutOfBoundsException()

    return list[index]
}

fun main() {
    val list = mutableListOf(16, 54, 9, 7, 4)
    println(nthElementOfList(list, 2))
}

// ?