package arithmetic

fun gcd(num1: Int, num2: Int): Int {
/*
    var halfMin = 0
    halfMin = if (num1 < num2) {
        if (num2 % num1 == 0) {
            return num1
        }
        num1 / 2
    } else {
        if (num1 % num2 == 0) {
            return num2
        }
        num2 / 2
    }

    var maxGcd = 1
    for (i in 2..halfMin) {
        if (num1 % i == 0 && num2 % i == 0) {
            maxGcd = i
        }
    }

    return maxGcd
*/
    return when {
        num1 == 0 -> num2
        num1 > num2 -> gcd(num2, num1)
        else -> gcd(num2 % num1, num1)
    }
}

fun main() {
    println(gcd(9, 25))
}
