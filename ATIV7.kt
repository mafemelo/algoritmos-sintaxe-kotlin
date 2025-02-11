fun main() {
println("Digite o lado de um quadrado: ")
val lado = readLine()!!.toInt()
val area= lado * lado
println("A área do quadrado é: $area")
val dobro= area + area
println("O dobro da área é: $dobro")
}