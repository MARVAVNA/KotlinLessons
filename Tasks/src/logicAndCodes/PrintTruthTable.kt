package logicAndCodes

fun Boolean.and_(bool: Boolean): Boolean = this && bool
fun Boolean.or_(bool: Boolean): Boolean = this || bool
fun Boolean.nand_(bool: Boolean): Boolean = !(this and bool)
fun Boolean.nor_(bool: Boolean): Boolean = !(this or bool)
fun Boolean.xor_(bool: Boolean): Boolean = this xor bool
fun Boolean.not_(): Boolean = !this

fun main() {
    println(true.not_())
}