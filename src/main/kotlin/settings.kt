var showWorkingOut:Boolean = false
var isInSettingsMode:Boolean = false
fun settingsMode() {
    isInSettingsMode = !isInSettingsMode

    while (isInSettingsMode) {
        when (readln()) {
            "Settings Mode" -> settingsMode()
            "showWorkingOut" -> showWorkingOut = readln().toBoolean()

        }
    }
}
