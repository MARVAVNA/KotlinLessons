package list

fun decode(list: List<Pair<Int, Char>>): List<Char> =
    list.flatMap { (first, second) -> List(first) { second } }

fun main() {
    println(decode(listOf(Pair(4, 'a'), Pair(1, 'b'), Pair(2, 'c'), Pair(2, 'a'), Pair(1, 'd'), Pair(4, 'e'))))
}