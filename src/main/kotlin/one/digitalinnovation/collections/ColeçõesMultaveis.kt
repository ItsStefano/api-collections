package one.digitalinnovation.collections

fun main () {


    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0, "PJ")
    val Joel = Funcionario("Joel", 3000.0, "CLT")

    val Funcionarios = mutableListOf(Joao, Maria)
    Funcionarios.forEach { println(it)}

    println("-----------LIST-----------")

    Funcionarios.add(Joel)
    Funcionarios.forEach { println(it)}

    println("---------------")

    Funcionarios.remove(Joao)
    Funcionarios.forEach { println(it)}

    println("-----------SET-----------")

    val FuncionarioSet = mutableSetOf(Joel)
    FuncionarioSet.forEach{ println(it)}

    println("---------------")

    FuncionarioSet.add(Joao)
    FuncionarioSet.add(Maria)
    FuncionarioSet.forEach{ println(it)}

    println("---------------")

    FuncionarioSet.remove(Maria)
    FuncionarioSet.forEach{ println(it)}

}