package questions

import i

fun help(){
    val cartesianPlane = arrayOf("length","Midpoint","gradient(slope)")


    println("----------------------------------------------")
    println("WHAT TOPIC DO YOU NEED HELP WITH?")
    println("----------------------------------------------")
    println("cartesian plane?")
    when (readln()) {
        "cartesian plane" -> helpMaker("Cartesian Plane", cartesianPlane)
    }

}
private fun helpMaker(groupName: String,array: Array<String>) {
    println("----------------------------------------------")
    println(groupName.uppercase())
    println("----------------------------------------------")
    arrayPrinter(array)
    println("----------------------------------------------")
}
private fun arrayPrinter( array: Array<String>){
    while (i != array.size) {
        println(array[i])
        i++
    }
    i = 0
}