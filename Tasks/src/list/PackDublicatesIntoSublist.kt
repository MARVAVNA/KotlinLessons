package list

fun <T> pack(charList: List<T>): List<List<T?>> {
    if (charList.isEmpty()) return listOf()

    var prevC: T? = null
    val list: MutableList<MutableList<T?>> = mutableListOf()
    var subList: MutableList<T?> = mutableListOf()
    for (c: T in charList) {
        if (prevC == c) {
            subList.add(prevC)
        } else if (prevC != null) {
            subList.add(prevC)
            list.add(subList)
            subList = mutableListOf()
        }
        prevC = c
    }
    if (prevC != null) {
        subList.add(prevC)
        list.add(subList)
    }

    return list.toList()
}

fun main() {
    println(pack("aaaabccaadeeee".toList()))
}