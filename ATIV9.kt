fun main() {
println("Digite uma temperatura em Fahrenheit : ")
val f = readLine()!!.toInt()

val celsius = 5 * ((f - 32)/9)
println("A temperatura em Celsius é : $celsius ")
}
