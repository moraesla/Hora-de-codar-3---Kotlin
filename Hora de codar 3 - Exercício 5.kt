fun main(){

    println("Informe o primeiro valor: ")
    var v1 = readln().toDouble()

    println("Informe o segundo valor (superior ao inicial): ")
    var v2 = readln().toDouble()

    var soma = 0.0
    var contador = v1
    var quantidade = 0

    while (contador <= v2){
        soma = soma + contador
        quantidade = quantidade + 1
        contador = contador + 1
    }

    val media = soma / quantidade

    println("A média aritmética dos números entre ($v1) e ($v2) é $media")
}