package list

fun <T> last(list: List<T>): T {
    if (list.isEmpty()) throw NoSuchElementException()

    return list[list.lastIndex]
}

fun main() {
    var list = mutableListOf(74)
    println(last(list))
}