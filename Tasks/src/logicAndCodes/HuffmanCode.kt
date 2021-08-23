package logicAndCodes

fun huffmanTree() {
    val map = linkedMapOf(Pair('a', 25), Pair('b', 21), Pair('c', 18), Pair('d', 14), Pair('e', 9), Pair('f', 7),
        Pair('g', 6))
    map.toSortedMap()
    println(map)
}

fun main() {
    huffmanTree()
}