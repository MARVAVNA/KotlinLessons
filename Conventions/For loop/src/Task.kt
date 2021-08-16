class DateRange(val start: MyDate, val end: MyDate): Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        return object : Iterator<MyDate> {
            var date: MyDate = start

            override fun next(): MyDate {
                if (!hasNext()) throw NoSuchElementException()

                val nextDate = date
                date = date.followingDate()
                return nextDate
            }

            override fun hasNext(): Boolean = date <= end
        }
    }

}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}