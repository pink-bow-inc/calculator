
import questions.cartesianPlaneMode
import questions.help

var debugMode:Boolean = true

fun main() {
    while (1==1) {
        when (readln()) {
            "help" -> help()
            "debug" -> debugMode = !debugMode
            "cartesian plane" -> cartesianPlaneMode()

        }
    }
}

var i = 0