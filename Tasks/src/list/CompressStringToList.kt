package list

// My solution
fun compress(charList: List<Char>): List<Char?> {
    if (charList.isEmpty()) return listOf()

    var prevC: Char? = null
    var list: MutableList<Char?> = mutableListOf()
    for (c: Char in charList) {
        if (prevC != c && prevC != null) {
            list.add(prevC)
        }
        prevC = c
    }
    if (prevC != null)
        list.add(prevC)

    return list.toList()
}

// Their solution
/*
fun <T> compress(list: List<T>) =
    list.fold(emptyList<T>()) { result, value ->
        if (result.isNotEmpty() && result.last() == value) result
        else result + value
    }
*/

fun main() {
    print(compress("aaaabccaadeeee".toList()))
}