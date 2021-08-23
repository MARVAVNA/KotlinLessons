package arithmetic

// My
fun Int.totient(): Int {
    var count = 0
    for (i in 1 until this) {
        if (i.isCoprimeTo(this)) {
            count++
        }
    }

    return count
}

// Their
// fun Int.totient() = (1..this).filter { it.isCoprimeTo(this) }.size

fun main() {
    println(315.totient())
}