fun main() {
    println("Introduce un número del 1 al 5:")
    val input = readLine()?.toIntOrNull()

    when (input) {
        1 -> println("Elegiste el número uno")
        2 -> println("Elegiste el número dos")
        3 -> println("Elegiste el número tres")
        4 -> println("Elegiste el número cuatro")
        5 -> println("Elegiste el número cinco")
        else -> println("Número no válido")
    }
}