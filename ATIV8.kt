fun main() {
println("Quanto você ganha por hora? : ")
val valor = readLine()!!.toInt()

println("Quanto horas você trabalha por mês? : ")
val horas = readLine()!!.toInt()

val salario = horas * valor
println("O seu salário por mês é : $salario")
}
