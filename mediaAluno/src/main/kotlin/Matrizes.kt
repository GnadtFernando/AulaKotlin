fun main (){

    val arrayOfInt = arrayOf(1,2,3,4,5,9)
    for ((index,numero) in arrayOfInt.withIndex()){
        println("Elemento $numero, tem o indece $index")
    }

    val arrayOfTodosTipos = arrayOf(4,3,4, "MG", false)
    for (tipo in arrayOfTodosTipos){
        println("Tipo $tipo")
    }

    intArrayOf(1,2,3,4,5)
    charArrayOf('a','b')

    val nome = "Liuhyupa Loenmis Olwe"
    val tamanhoNome = nome.length

    println("\ntotal de letras: $tamanhoNome")
    println("letra: " + nome [5])

    for(letra in nome){
        println("Letra: $letra")
    }
}