package questions.cartesianPlane

import debugMode
import kotlin.math.pow
import kotlin.math.sqrt

fun length(){
    println("type your coronets individually and pressing enter after every number. in this order 'x1 y1 x2 y2'")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answer = sqrt((cords[2] - cords[0]).pow(2)+(cords[3] - cords[1]).pow(2))

    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")
    if (debugMode) {

        println("working out")
        println("----------------------------------------------")
        println("sqrt((" + cords[2] + " - " + cords[0] + ")^2+(" + cords[3] + " - " + cords[1] + ")^2) = " + answer)
    }

}