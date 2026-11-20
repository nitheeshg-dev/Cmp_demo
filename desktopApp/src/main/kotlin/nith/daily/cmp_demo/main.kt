package nith.daily.cmp_demo

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Cmp_demo",
    ) {
        App()
    }
}