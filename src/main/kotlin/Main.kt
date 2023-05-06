import questions.cartesianPlaneMode
fun main() {
    while (1==1) {
        when (readln()) {
            "help" -> helpMaker("LIST OF ALL CATEGORY'S",
                arrayOf("cartesian plane"))
            "debug" -> debugMode = !debugMode
            "cartesian plane" -> cartesianPlaneMode()

        }
    }
}

var debugMode:Boolean = true
var i = 0