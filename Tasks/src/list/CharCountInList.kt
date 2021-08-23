package list

fun encode(list: List<Char>): List<Pair<Int, Char?>> =
    pack(list).map { Pair(it.size, it.first()) }

fun main() {
    println(encode("aaaabccaadeeee".toList()))
}