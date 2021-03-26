package one.digitalinnovation.collections

fun main () {

    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0,"PJ")
    val Joel = Funcionario("Joel", 3000.0, "CLT")

    val funcionarios = listOf(Joao, Maria, Joel)

    funcionarios.forEach { println(it) }

    println("----------")

    println(funcionarios.find { it.nome == "Joel" })

    println("----------")

    funcionarios.sortedBy { it.tipoContrato }.forEach { println(it) }

}
    data class Funcionario(
        val nome: String,
        val salario: Double,
        val tipoContrato: String
    )
    {
        override fun toString (): String =
            """
                Nome: $nome
                salario: $salario
                tipoContrato: $tipoContrato
            """.trimIndent()
    }

