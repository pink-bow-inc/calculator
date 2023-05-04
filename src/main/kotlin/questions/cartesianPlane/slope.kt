package questions.cartesianPlane

import showWorkingOut

fun slope(){
    println("type your coronets individually and pressing enter after every number")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answer = (cords[3] - cords[1])/(cords[0]-cords[2])

    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")
    if (showWorkingOut) {

        println("working out")
        println("----------------------------------------------")
        println("(" + cords[3] + "-" + cords[1]+ ")" + "/" + "(" + cords[3] + "-" + cords[1]+ ") = " + answer)
    }
}