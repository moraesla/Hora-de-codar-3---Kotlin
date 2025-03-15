fun main(){

    var ordem = 1
    var contador = 1
    var soma = 0
    var dentro = 0
    var fora = 0

    while(contador <= 10){
        println("Informe o $ordem número: ")
        var numero = readln().toInt()
        soma = soma + numero
        contador = contador + 1
        ordem = ordem + 1

        if(numero >= 24 && numero <= 42){
            dentro = dentro + 1
        }
        else{
            fora = fora + 1
        }

        println("A quantidade de valores dentro do intervalo (24 a 42) é: $dentro")
        println("A quantidade de valores fora do intervalo (24 a 42) é: $fora")
    }
}

