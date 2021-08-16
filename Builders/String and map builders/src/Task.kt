import java.util.HashMap

fun buildMap(map: HashMap<Int, String>.() -> Unit): HashMap<Int, String> {
    val hashMap: HashMap<Int, String> = HashMap()
    hashMap.map()
    return hashMap
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}

fun main() {
    println(usage())
}