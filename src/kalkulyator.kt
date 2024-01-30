fun task1() {
    while (true) {
        try {
            var x = readLine()?.toDoubleOrNull()!!
            var b = readLine()!!
            var y = readLine()!!.toDouble()
            calculate(x, y, b)
        } catch(e:Exception){
            println("Ошибка")
        }
    }
}

fun main() {
    task1()
}

fun calculate(x: Double, y: Double, b: String) {
    when (b) {
        "+" -> println("$x + $y = ${x + y}")
        "-" -> println("$x - $y = ${x - y}")
        "*" -> println("$x * $y = ${x * y}")
        "/" -> println("$x / $y = ${x.toFloat() / y}")
        else -> print("Ошибка")
    }
}