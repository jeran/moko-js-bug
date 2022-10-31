import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import dev.icerock.moko.resources.desc.desc
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable
import strings.resources.MR

fun main() {
    renderComposable(rootElementId = "root") {
        val stringDesc = remember { MR.strings.hello_world.desc() }
        var helloWorld by remember { mutableStateOf("") }
        LaunchedEffect(stringDesc) {
            helloWorld = MR.strings.hello_world.desc().localized()
        }
        Text(helloWorld)
    }
}
