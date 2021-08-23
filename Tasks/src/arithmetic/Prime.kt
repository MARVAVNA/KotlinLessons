package arithmetic

fun Int.isPrime(): Boolean {
    if (this in 1..3) return true

    for (i in 2..(this / 2)) {
        if (this % i == 0) {
            return false
        }
    }

    return true
}

fun main() {
    println(1361.isPrime())
}