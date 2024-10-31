fun funcionCompleja(entrada: Int): String {
    var resultado = ""
    var contador = entrada

    while (contador > 0) {
        when (contador % 3) {
            0 -> resultado += "Fizz"
            1 -> resultado += "Buzz"
            2 -> resultado += "FizzBuzz"
        }
        contador--
    }

    return resultado
}

fun main(){
    println(funcionCompleja(5))
}