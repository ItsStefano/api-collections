package one.digitalinnovation.collections

fun main () {

    val nomes = Array (3) {""}
    nomes [0] = "Nosrewy"
    nomes [1] = "Luke"
    nomes [2] = "Lucas"

    for (nome in nomes) {
        println(nome)

    }

    println("-----")
    nomes.sort()
    nomes.forEach { println(it) }

    println("-----")

    val nomes2 = arrayOf("Maria", "Zasha", "Peter")
    nomes2.sort()
    nomes2.forEach { println(it) }

}