fun main (){
    var x = readLine()?.toDoubleOrNull()!!
    var b = readLine()!!
    var y = readLine()!!.toDouble()
    when(b){
        "+"-> println("$x + $y = ${x+y}")
        "-"-> println("$x - $y = ${x-y}")
        "*"-> println("$x * $y = ${x*y}")
        "/"-> println("$x / $y = ${x.toFloat()/y}")
        else->print("Ошибка")
    }
}