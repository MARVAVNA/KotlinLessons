package list

fun <T> isPalindrom(list: List<T>): Boolean {
    if (list.size <= 1) return true
    for (i in 0 until list.lastIndex) {
        if (list[i] != list[list.lastIndex - i]) return false
    }

    return true
}

fun main() {
    print(isPalindrom(listOf(1, 2, 3, 20, 1)))
}