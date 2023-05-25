fun questionassistant(answer: String,debug: String,wantAnswerInDebug: Boolean) {
    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")

    if (debugMode) {
        println("debug")
        println("----------------------------------------------")
        println(debug)
        if (wantAnswerInDebug) {println(answer)}
        println("----------------------------------------------")

    }
    println("")
}

fun helpMaker(array: Array<String>) {
    println("----------------------------------------------")
    println("HERE IS A LIST OF ALL POSSIBLE FUNCTIONS")
    println("----------------------------------------------")
    arrayPrinter(array)
    println("----------------------------------------------")
}
fun arrayPrinter( array: Array<String>){
    while (i != array.size) {
        println(array[i])
        i++
    }
    i = 0
}

