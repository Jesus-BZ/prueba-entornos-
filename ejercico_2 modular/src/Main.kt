fun main() {
    var r = dar_dato()
    area(r)
    longitud(r)
}
fun dar_dato():Int{
    var radio =0
    println("introduzca el valor del radio de su circulo")
    radio = readln().toInt()
    return radio
}
fun area (r:Int){
    var a=((2*3.14)*r*r)
    println("el resultado de area es $a ")
}
fun longitud (r:Int){
    var l= ((2*3.14)*r)
    println("el resultado de la longitud  es $l ")
}