package list

fun <T: Any> encodeModified(list: List<T>): List<Any?> =
    pack(list).map {
        if (it.size == 1) it.first()
        else Pair(it.size, it.first())
    }

fun main() {
    println(encodeModified("aaaabccaadeeee".toList()))
}