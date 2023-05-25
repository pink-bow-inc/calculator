import questions.cartesianPlaneMode
import questions.geometryMode

fun main() {
    while (1==1) {
        when (readln()) {
            "help" -> helpMaker(arrayOf("cartesian plane", "geometry"))
            "debug" -> debugMode = !debugMode
            "cartesian plane" -> cartesianPlaneMode()
            "geometry" -> geometryMode()

        }
    }
}

var debugMode:Boolean = false
var i = 0