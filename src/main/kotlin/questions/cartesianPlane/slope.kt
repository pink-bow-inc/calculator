package questions.cartesianPlane

import debugMode

fun slope(){
    println("type your coronets individually and pressing enter after every number. in this order 'x1 y1 x2 y2'")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answer = (cords[3] - cords[1])/(cords[2]-cords[0])

    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")
    if (debugMode) {

        println("debug")
        println("----------------------------------------------")
        println("(" + cords[3] + "-" + cords[1]+ ")" + "/" + "(" + cords[2] + "-" + cords[0]+ ") = " + answer)
    }
}