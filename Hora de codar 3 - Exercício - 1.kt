fun main(){

    println("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    println("Informe o segundo valor: ")
    var v2 = readln().toDouble()

    while (v2 <= 0){
        println("Informe um novo valor: ")
        v2 = readln().toDouble()
    }

    var divisao = v1 / v2

    println("O resultado da divisão é: $divisao")
}