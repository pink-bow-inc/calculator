fun questionAssist(answer: String,debug: String) {
    println("----------------------------------------------")
    println(answer)
    println("----------------------------------------------")

    if (debugMode) {
        println("debug")
        println("----------------------------------------------")
        println(debug + answer)
        println("----------------------------------------------")

    }
    println("")
}

fun helpMaker(display: String,array: Array<String>) {
    println("----------------------------------------------")
    println(display.uppercase())
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