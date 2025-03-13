fun main(){

    var soma = 0
    var contador = 0
    var numeros = 100

    while(numeros >= 15){
        soma = soma + numeros
        contador = contador + 1
        numeros = numeros - 1
    }

    var media = soma / contador

    println("O resultado da média aritmética dos números inteiros entre 15 (inclusive) e 100 (inclusive) é: $media")


}