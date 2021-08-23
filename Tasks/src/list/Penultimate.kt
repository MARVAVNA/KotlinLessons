package list

fun <T> penultimate(list: List<T>): T {
    if (list.isEmpty()) throw NoSuchElementException()
    return if (list.size > 1) list[list.lastIndex - 1] else list[0]
}

fun main() {
    var list = mutableListOf(29)
    list.remove(29)
    println(penultimate(list))
}