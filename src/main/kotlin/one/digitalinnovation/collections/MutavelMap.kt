package one.digitalinnovation.collections

fun main () {

    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Maria = Funcionario("Maria", 5000.0, "PJ")
    val Joel = Funcionario("Joel", 3000.0, "CLT")

    val repositorio = Repositorio <Funcionario>()

    repositorio.create(Joao.nome, Joao)
    repositorio.create(Maria.nome, Maria)
    repositorio.create(Joel.nome, Joel)

    println(repositorio.findById(Maria.nome))

    println("------------------")

    repositorio.findAll().forEach {println(it)}

    println("------------------")

    repositorio.remove(Maria.nome)
    repositorio.findAll().forEach{println(it)}

}