fun main(){

    var aprovacao = 0
    var opcao = "S"

    while (opcao == "S"){
        println("Informe a primeira nota: ")
    var nota1 = readln().toDouble()

    println("Informe a segunda nota: ")
    var nota2 = readln().toDouble()

    var media = (nota1 + nota2) / 2


    if(media >= 9.5){
        println("Aluno aprovado!")
        aprovacao = aprovacao + 1
    }
    else{
        println("Aluno reprovado!")
    }

    println("O resultado da média é: $media")

    println("Calcular a média de outro aluno (S/N)? ")
      opcao = readln()
    }

    println("A quantidades de alunos aprovados é: $aprovacao")
}