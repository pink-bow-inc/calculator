package questions

import debugMode
import helpMaker
import questionAssist
import kotlin.math.pow
import kotlin.math.sqrt

var cartesianPlane:Boolean = false
fun cartesianPlaneMode() {
    cartesianPlane = !cartesianPlane

    while (cartesianPlane) {
        println("type your coronets individually and pressing enter after every number. in this order 'x1 y1 x2 y2'")

        val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

        when (readln()) {
            "cartesianPlaneMode" -> cartesianPlaneMode()
            "debug" -> debugMode = !debugMode
            "help" -> helpMaker(
                "Here is a list of all possible functions",
                arrayOf("slope", "midPoint", "length", "all")
            )

            "slope" -> questionAssist(
                ((cords[3] - cords[1]) / (cords[2] - cords[0])).toString(),
                "(" + cords[3] + "-" + cords[1] + ")" + "/" + "(" + cords[2] + "-" + cords[0] + ") = "
            )

            "midPoint" -> questionAssist(
                ((cords[0] + cords[2]) / 2).toString() + (cords[1] + cords[3]) / 2,
                "(" + cords[0] + "+" + cords[2] + ")/2" + "," + "(" + cords[1] + "+" + cords[3] + ")/2 = "
            )

            "length" -> questionAssist(
                sqrt((cords[2] - cords[0]).pow(2) + (cords[3] - cords[1]).pow(2)).toString(),
                "sqrt((" + cords[2] + " - " + cords[0] + ")^2+(" + cords[3] + " - " + cords[1] + ")^2) = "
            )

            "all" -> {
                println("slope =")
                questionAssist(
                    ((cords[3] - cords[1]) / (cords[2] - cords[0])).toString(),
                    "(" + cords[3] + "-" + cords[1] + ")" + "/" + "(" + cords[2] + "-" + cords[0] + ") = "
                )

                println("midPoint = ")
                questionAssist(
                    ((cords[0] + cords[2]) / 2).toString() + (cords[1] + cords[3]) / 2,
                    "(" + cords[0] + "+" + cords[2] + ")/2" + "," + "(" + cords[1] + "+" + cords[3] + ")/2 = "
                )

                println("length = ")
                questionAssist(
                    sqrt((cords[2] - cords[0]).pow(2) + (cords[3] - cords[1]).pow(2)).toString(),
                    "sqrt((" + cords[2] + " - " + cords[0] + ")^2+(" + cords[3] + " - " + cords[1] + ")^2) = "
                )
            }
        }
    }
}
