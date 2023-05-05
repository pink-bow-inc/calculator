package questions.cartesianPlane

import debugMode

fun midPoint(){
    println("type your coronets individually and pressing enter after every number. in this order 'x1 y1 x2 y2'")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answer = arrayOf((cords[0] + cords[2])/2,(cords[1] + cords[3])/2)

    println("----------------------------------------------")
    println(""+answer[1] + "," + answer[2])
    println("----------------------------------------------")
    if (debugMode) {

        println("debug")
        println("----------------------------------------------")
        println("(" + cords[0] + "+" + cords[2] + ")/2" + "," + "(" + cords[1] + "+" + cords[3] + ")/2 = "  + answer[1] + "," + answer[2])
    }
}