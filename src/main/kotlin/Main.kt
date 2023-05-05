import questions.cartesianPlane.length
import questions.cartesianPlane.midPoint
import questions.cartesianPlane.slope
import questions.help

fun main() {
    while (1==1) {
        when (readln()) {
            "help" -> help()
            "length" -> length()
            "midPoint" -> midPoint()
            "slope" -> slope()
            "Settings Mode" -> settingsMode()
        }
    }
}

var i = 0