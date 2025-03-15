fun main(){

    var retorno = 1
    var a = 1
    var b = 1
    var tabuada = 1

    println("Informe um número: ")
    var numero = readln().toInt()

    while(retorno <= numero){
    while(tabuada <= 10){
        println("$a X $b = ${a*b}")
        b++
        tabuada++
    }

        println("\n")

        b = 1
        tabuada = 1
        retorno++
        a++
    }
}

