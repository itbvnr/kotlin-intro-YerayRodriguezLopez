fun main(){
    val area = calcVolumen(getHeight(), getWidth(), getDepth())
    println("Tu pizza es de tamaño: $area cm de area")
}
fun calcVolumen(height: Float, width: Float, depth: Float): Float{
    return height * width * depth
}
fun getHeight(): Float{
    println("Introduce la altura de la habitacion")
    return getFloat()
}
fun getWidth(): Float{
    println("Introduce el ancho de la habitacion")
    return getFloat()
}fun getDepth(): Float{
    println("Introduce la profundidad de la habitacion")
    return getFloat()
}
fun getFloat(): Float{
    var myFloat = 0.0f
    var flag = true
    while(flag){
        try {
            myFloat = readln().toFloat()
            flag = false
            if(myFloat >= 0){
                flag = true
                println("Valor invalido")
            }
        }
        catch (e: Exception){
            println("Valor invalido")
        }
    }
    return myFloat
}