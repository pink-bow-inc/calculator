package questions.cartesianPlane

import showWorkingOut

fun midPoint(){
    println("type your coronets individually and pressing enter after every number")

    val cords = arrayOf<Float>(readln().toFloat(),readln().toFloat(),readln().toFloat(),readln().toFloat())

    val answerP1 = (cords[0] + cords[2])/2
    val answerP2 = (cords[1] + cords[3])/2

    println("----------------------------------------------")
    println("$answerP1,$answerP2")
    println("----------------------------------------------")
    if (showWorkingOut) {

        println("working out")
        println("----------------------------------------------")
        println("(" + cords[0] + "+" + cords[2] + ")/2" + "," + "(" + cords[1] + "+" + cords[3] + ")/2 = " + "$answerP1,$answerP2")
    }
}