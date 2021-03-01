import java.lang.Exception

fun main(){

    // var nome: String? = null //nao pode te nulo
    // nome = "Fernando"
    // println(nome.length)
try{
    val sobreNome:String? = null
    println(sobreNome!!.length)

}   catch (ex:Exception) {
    print("error " + ex.message)
    }

    val nomeZe = "Ze maria"
    val nomeDoZe = if (nomeZe == "Ze maria" || nomeZe != null){
            nomeZe
    } else "Nao achei o nome"

    //val nomeRetornadoDoZe2 == nomeDoZe == "Ze maria" ?: "Nao achei o nome"
    // println(nomeRetornadoDoZe2)

    //var tamanhoDoNome:Int = nomeDoZe?.length ?: -1

    lateinit var animal: String

    animal = "Cavalo"
    println()
    println(animal)


    var carro:String? = null
    carro = "Fusca"

    carro.let{
        println("O carro é $carro")
        println("A palavra $carro tem ${carro.length} caracteres")
    }

}