package lambdas
data class aluno(val nome: String, val nota: Double)
fun main(args: Array<String>){
    val alunos = arrayListOf(
        aluno("Pedro", 7.4),
    aluno("Artur", 8.0),
    aluno("Rafael", 9.7),
    aluno("Ricardo", 5.7)
    )

    val aprovados = alunos.filter{ it.nota > 7.0}.sortedBy {it.nome}
    println(aprovados)
}