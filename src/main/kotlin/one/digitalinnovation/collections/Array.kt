package one.digitalinnovation.collections

fun main () {

    val values: IntArray = intArrayOf(7, 1, 2, 3, 4)

    for (valor in values) {
        print(valor)
    }
    println(" ")

    values.forEach {
        print(it)
    }
    println(" ")

    values.forEach { valor ->
        print(valor)
    }
    println(" ")

    for (index in values.indices) {
        print(values[index])

    }
    println(" ")

    values.sort()
    for (valor in values) {
        print(valor)

    }
    println(" ")
}

