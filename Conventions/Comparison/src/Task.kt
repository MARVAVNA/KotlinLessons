data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        var check: Int = year - other.year

        if (check != 0) return check

        check = month - other.month

        if (check != 0) return check

        return dayOfMonth - other.dayOfMonth
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
