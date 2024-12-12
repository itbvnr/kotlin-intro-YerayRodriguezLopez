fun main(){
    println("Introduce el diametro de tu pizza")
    val radio: Float = getFloat()/2
    val area: Float = calcArea(radio)
    println("Tu pizza mide $area centimetros cuadrados")
}
fun calcArea(radio: Float): Float{
    val pi = 3.14f
    return pi * (radio * radio)
}
fun getFloat(): Float{
    var myFloat = 0.0f
    var flag = true
    while(flag){
        try {
            myFloat = readln().toFloat()
            flag = false
        }
        catch (e: Exception){
            println("Valor invalido")
        }
    }
    return myFloat
}