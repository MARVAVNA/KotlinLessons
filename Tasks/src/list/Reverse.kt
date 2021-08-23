package list

fun <T> reverse(list: List<T>): List<T> {
    return if (list.size <= 1) list else list.reversed()
}

fun main() {
    var list = mutableListOf(-7)
    list.remove(-7)
    print(reverse(list))
}

// ?