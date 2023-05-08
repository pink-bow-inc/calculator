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


        when (readln()) {
            "cartesianPlaneMode" -> cartesianPlaneMode()
            "debug" -> debugMode = !debugMode
            "help" -> helpMaker(
                "Here is a list of all possible functions",
                arrayOf("slope", "midPoint", "length", "all")
            )

            "slope" -> slope(inputCoordinates())

            "midPoint" -> midPoint(inputCoordinates())

            "length" -> length(inputCoordinates())

            "all" -> {
                val coordinates = inputCoordinates()

                println("slope =")
                slope(coordinates)

                println("midPoint = ")
                midPoint(coordinates)

                println("length = ")
                length(coordinates)
            }
        }
    }
}
fun inputCoordinates(): Array<Float> {
    println("type your coronets individually and pressing enter after every number. in this order 'x1 y1 x2 y2'")
    return arrayOf<Float>(readln().toFloat(), readln().toFloat(), readln().toFloat(), readln().toFloat())
}
fun slope(input: Array<Float>){
    questionAssist(
        ((input[3] - input[1]) / (input[2] - input[0])).toString(),                                   //answer to the question
        "(" + input[3] + "-" + input[1] + ")" + "/" + "(" + input[2] + "-" + input[0] + ") = " //expanded working out
    )
}
fun midPoint(input: Array<Float>){
    questionAssist(
        ((input[0] + input[2]) / 2).toString() + (input[1] + input[3]) / 2,                        //answer to the question
        "(" + input[0] + "+" + input[2] + ")/2" + "," + "(" + input[1] + "+" + input[3] + ")/2 = " //expanded working out
    )
}
fun length(input: Array<Float>){
    questionAssist(
        sqrt((input[2] - input[0]).pow(2) + (input[3] - input[1]).pow(2)).toString(),            //answer to the question
        "sqrt((" + input[2] + " - " + input[0] + ")^2+(" + input[3] + " - " + input[1] + ")^2) = " //expanded working out
    )
}
