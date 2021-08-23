package logicAndCodes

fun grayCodes(bits: Int): List<String> =
    if (bits <= 0) listOf("")
    else {
        val bitsList = grayCodes(bits - 1)
        bitsList.map {
            "0$it"
        } + bitsList.asReversed().map {
            "1$it"
        }
    }

/*fun grayCodes(bits: Int): List<String> =
    if (bits == 0) listOf("")
    else {
        val codes = grayCodes(bits - 1)
        codes.map { "0$it" } + codes.asReversed().map { "1$it" }
    }*/

fun main() {
    println(grayCodes(7))
}