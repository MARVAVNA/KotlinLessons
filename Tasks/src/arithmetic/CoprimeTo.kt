package arithmetic

fun Int.isCoprimeTo(num: Int): Boolean = gcd(this, num) == 1

fun main() {
    println(41.isCoprimeTo(25))
}