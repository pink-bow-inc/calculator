var debugMode:Boolean = true
var isInSettingsMode:Boolean = false
fun settingsMode() {
    isInSettingsMode = !isInSettingsMode

    while (isInSettingsMode) {
        when (readln()) {
            "Settings Mode" -> settingsMode()
            "debugMode" -> debugMode = readln().toBoolean()

        }
    }
}
