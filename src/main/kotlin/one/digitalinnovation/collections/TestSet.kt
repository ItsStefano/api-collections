package one.digitalinnovation.collections

fun main () {

    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0,"PJ")
    val Joel = Funcionario("Joel", 3000.0, "CLT")

    val Funcionario1 = setOf(Joao, Joel)
    val Funcionario2 = setOf(Maria)

    val resultUnion = Funcionario1.union(Funcionario2)
    resultUnion.forEach{(println(it))}

    println("------------")

    val Funcionario3 = setOf(Joao, Joel, Maria)
    val resultSubtract = Funcionario3.subtract(Funcionario2)
    resultSubtract.forEach{(println(it))}

    println("------------")

    val resultIntersect = Funcionario3.intersect(Funcionario2)
    resultIntersect.forEach{(println(it))}






}