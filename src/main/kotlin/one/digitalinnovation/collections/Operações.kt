package one.digitalinnovation.collections

fun main () {

    val salarios = doubleArrayOf(1000.0, 1500.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("----------------")

    println("Maior salário é: ${salarios.maxOrNull()}")
    println ("Menor salário é: ${salarios.minOrNull()}")
    println ("Média dos salários: ${salarios.average()}")

     val salariosMaiorQue1500 = salarios.filter { it >= 1500.0 }

    println("----------------")

    salariosMaiorQue1500.forEach { println(it) }

    println("----------------")

    println(salarios.count {it in 1000.0..4000.0})

    println("----------------")

    println(salarios.find {it == 1000.0})
    println(salarios.find {it == 500.0})

    println("----------------")
    println(salarios.any {it == 1000.0})
    println(salarios.any {it == 500.0})

}