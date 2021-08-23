package arithmetic

fun printGoldbachList(intRange: IntRange): Unit {
    val first: Int = if (intRange.first % 2 == 0) intRange.first else intRange.first + 1
    var pair: Pair<Int, Int>

    for (i in first..intRange.last step 2) {
        pair = i.goldbach()
        println("$i = ${pair.first} + ${pair.second}")
    }
}

/*fun goldbachList(range: IntRange) =
    range.filter { it % 2 == 0 }.map { it.goldbach() }

fun printGoldbachList(range: IntRange) =
    goldbachList(range).forEach { println(it.toStringSum()) }

private fun Pair<Int, Int>.toStringSum() = "${first + second} = $first + $second"*/

fun main() {
    printGoldbachList(158..1378)
}