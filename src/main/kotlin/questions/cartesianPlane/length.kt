package questions.cartesianPlane

import showWorkingOut
import kotlin.math.pow
import kotlin.math.sqrt

fun length(){
    println("type your coronets individually and pressing enter after every number")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answer = sqrt((cords[2] + cords[0]).pow(2)+(cords[3] + cords[1]).pow(2))

    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")
    if (showWorkingOut) {

        println("working out")
        println("----------------------------------------------")
        println("sqrt((" + cords[2] + " + " + cords[0] + ")^2+(" + cords[3] + " + " + cords[1] + ")^2) = " + answer)
    }
}