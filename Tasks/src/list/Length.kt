package list

fun <T> length(list: List<T>): Int = list.size

fun main() {
    var list = mutableListOf(1)
    list.remove(1)
    println(length(list))
}

// ?