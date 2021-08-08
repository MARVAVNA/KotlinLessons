fun joinOptions(options: Collection<String>) =
        options.joinToString(prefix = "[", postfix = "]")

fun main() {
    val list = listOf("Artur", "Anahit", "Arman", "Vahe", "Nare", "Armine")
    println(joinOptions(list))
}
