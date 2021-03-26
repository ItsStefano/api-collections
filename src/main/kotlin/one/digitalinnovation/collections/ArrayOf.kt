package one.digitalinnovation.collections

fun main () {
    val values = intArrayOf(2, 6, 12, 24, 48)

    values.forEach {
        print(it)
    }
    println()

    values.sort()
    values.forEach {
        print(it)
    }
}