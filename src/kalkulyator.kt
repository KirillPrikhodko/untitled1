fun main (){
    var x = readLine()?.toDoubleOrNull()!!
    var b = readLine()!!
    var y = readLine()!!.toDouble()
    calculate(x, y, b)
}
fun calculate(x:Double, y:Double, b:String){
    when(b){
        "+"-> println("$x + $y = ${x+y}")
        "-"-> println("$x - $y = ${x-y}")
        "*"-> println("$x * $y = ${x*y}")
        "/"-> println("$x / $y = ${x.toFloat()/y}")
        else->print("Ошибка")
    }
}