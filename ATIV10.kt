fun main() {
println("Digite uma temperatura em Celsius : ")
val c = readLine()!!.toInt()

val fahrenheit = 1.8 * c + 32
println("A temperatura em Fahrenheit é : $fahrenheit ")
}
