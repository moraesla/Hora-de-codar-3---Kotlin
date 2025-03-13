fun main(){
    var contador = 1

    println("Informe um valor: ")
    var valor = readln().toInt()

    while(valor >= contador) {
        println("$contador")
        contador = contador + 1
    }

}