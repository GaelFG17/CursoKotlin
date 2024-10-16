fun imprimirTablaMultiplicar(numero: Int) {
    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }
}

fun main() {
    val numero = 5 // Cambia este valor por el número deseado
    imprimirTablaMultiplicar(numero)
}