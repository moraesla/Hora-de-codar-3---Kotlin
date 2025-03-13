fun main() {

    var contador = 1
    var ordem = 1
    var soma = 0
    val numeros = mutableListOf<Int>()

    while (contador <= 6) {
        println("Informe a $ordem nota: ")
        val numero = readln().toInt()
        numeros.add(numero)
        if (numero < 72) {
            soma = soma + numero
        }
        contador = contador + 1
        ordem = ordem + 1

    }
}