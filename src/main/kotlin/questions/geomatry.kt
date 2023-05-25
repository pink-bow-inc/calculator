package questions

import debugMode
import helpMaker

import questionassistant

var geometryMode:Boolean = false
fun geometryMode() {
    geometryMode = !geometryMode

    while (geometryMode) {
        when(readln()) {
            "cartesianPlaneMode" -> cartesianPlaneMode()
            "debug" -> debugMode = !debugMode
            "help" -> helpMaker(arrayOf("find Ratio","find value based on Ratio|ratio value finder|RVF","TO DO (scale factor)"))

            "find Ratio" -> {
                println("original number then scaled number then you output unit")
                findRatio(arrayOf(readln(), readln(), readln()))
            }
            "find value based on Ratio","RVF","ratio value finder" -> {
                println(" ratio (without 1| just the second number)+ number + you output unit")
                findValueBasedOnRatio(arrayOf(readln(), readln(), readln()))
            }

            "test modifyNumberBasedOnUnit" -> {println(modifyNumberBasedOnUnit(readln()))}
        }
    }
}
fun findValueBasedOnRatio(input: Array<String>) {
    println("if you inputted original number")
    questionassistant((outputUnit(input[2],modifyNumberBasedOnUnit(input[1])/input[0].toFloat())).toString() + input[2],
        "to tried to code this",
        false)
    
    println("if you inputted anti-original number")
    questionassistant((outputUnit(input[2],modifyNumberBasedOnUnit(input[1])*input[0].toFloat())).toString() + input[2],
        input[1] + "*" + modifyNumberBasedOnUnit("100" + input[2]) + "*" + input[0] + "/" + modifyNumberBasedOnUnit("1" + input[2]) + " = ",
        true)
}

fun findRatio(input: Array<String>) {
    //number modification
    val i1 = modifyNumberBasedOnUnit(input[0])
    val i2 = modifyNumberBasedOnUnit(input[1])
    //question assistant
    questionassistant(("1|" + outputUnit(input[2],i1/i2).toString()),
        "1|" + modifyNumberBasedOnUnit("100" + input[2]),
        false)
}
fun outputUnit(unit: String,number: Float):Float {
     return when(unit.lowercase()) {
         "km" -> number/1000000
         "m" -> number/1000
         "cm" -> number/10
         else -> number
     }
}
fun modifyNumberBasedOnUnit(input: String):Float {
    return when {
        input.lowercase().contains("km") -> {input.replace("km", "").toFloat()*1000000}
        input.lowercase().contains("cm") -> {input.replace("cm", "").toFloat()*10}
        input.lowercase().contains("mm") -> {input.replace("mm", "").toFloat()}
        input.lowercase().contains("m") -> {input.replace("m", "").toFloat()*1000}
        else -> input.toFloat()
    }
}