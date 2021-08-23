package logicAndCodes

fun List<Boolean>.withoutFirst() = drop(1).toBooleanArray()

fun Boolean.and_(vararg bools: Boolean): Boolean {
    return if (bools.isEmpty())
        this
    else {
        this.and_(bools.first()).and_(*bools.toList().withoutFirst())
    }
}

fun Boolean.or_(vararg bools: Boolean): Boolean {
    return if (bools.isEmpty())
        this
    else {
        this.or_(bools.first()).or_(*bools.toList().withoutFirst())
    }
}

fun Boolean.xor_(vararg bools: Boolean): Boolean {
    return if (bools.isEmpty())
        this
    else {
        this.xor_(bools.first()).xor_(*bools.toList().withoutFirst())
    }
}

/*private fun BooleanArray.tail() = drop(1).toBooleanArray()

fun Boolean.or_(vararg others: Boolean): Boolean =
    if (others.isEmpty()) this else this.or_(others.first()).or_(*others.tail())*/

fun main() {
    println(false.xor_(true, false, false))
}