import java.util.*

val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun main() {
    val monthList: List<String> = month.removeSurrounding("(", ")").split("|")
    val date = "13.06.1992"
    println(getPattern(date, monthList))
}

//fun getPattern(): String = """\d{2} $month \d{4}"""
//Peek Solution

//My version
fun getPattern(date: String, monthList: List<String>): String {
    val dateList = date.split('.')
    validateDate(dateList)

    return "${dateList[0]} ${monthList[dateList[1].toInt() - 1]} ${dateList[2]}"
}

fun validateDate(dateSplit: List<String>): Boolean {
    if (dateSplit.size != 3 || dateSplit[0] == "" || dateSplit[1] == "" || dateSplit[2] == "") {
        throw IllegalArgumentException("The date format is not correct. The available format should be: **.**.****")
    }

    val day: Int = dateSplit[0].toInt()
    if (day < 1 || day > 31) {
        throw IllegalArgumentException("Illegal date day")
    }

    val month: Int = dateSplit[1].toInt()
    if (month < 1 || month > 12) {
        throw IllegalArgumentException("Illegal month date")
    }

    val year: Int = dateSplit[2].toInt()
    if (year < 1 || year > 9999) {
        throw IllegalArgumentException("Illegal year date")
    }

    return true
}
