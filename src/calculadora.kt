fun main() {
    println("Ingrese el primer número:")
    val num1 = readLine()!!.toDouble()

    println("Ingrese el segundo número:")
    val num2 = readLine()!!.toDouble()

    println("Seleccione una operación (+, -, *, /):")
    val operacion = readLine()

    val resultado = when (operacion) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else "Error: División por cero"
        else -> "Operación no válida"
    }

    println("El resultado es: $resultado")
}