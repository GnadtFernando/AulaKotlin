fun main(args: Array<String>) {
    val nome = args[0]
    val matricula = args[1]
    val idade = 20
    val nota = listOf(args[2], args[3], args[4], args[5]).map(String::toDouble)
    val media = mediaAluno(nota[0], nota[1], nota[2], nota[3])

    when {
        idade >= 18 -> println("Bons Estudos!!")
        idade <= 17 -> println("Você deve completar a maioridade")
    }

    println("Aluno: " + nome + "\nMatricula: " + matricula + "\nIdade: " + idade + "\nPrimeira nota: " + nota[0] + "\nSegunda nota: " + nota[1] + "\nTreceira nota: " + nota[2] + "\nUltima nota: " + nota[3] + "\nMedia: " + media)

    if (media >= 7){
        println("\nVocê passou de semestre")
    }else {
        println("\nEstude mais")
    }
}

fun mediaAluno(nota1: Double, nota2: Double, nota3: Double, nota4: Double): Double{
    return (nota1+nota2+nota3+nota4)/4
    }