package list
val newList: MutableList<Any>? = mutableListOf()

fun <T> flatten(list: List<T>): List<T> =
list.flatMap {
    if (it is List<*>)
        flatten(it as List<T>)
    else
        listOf(it)
}

fun main() {
    println(flatten(listOf(listOf(15, 7, -41), listOf(3, 2, listOf(5, listOf(-8, 13, 951), 8)), 0, listOf(16, -1))))
}