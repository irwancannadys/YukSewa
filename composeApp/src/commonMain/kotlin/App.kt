import androidx.compose.runtime.Composable
import navigation.RootComponent
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App(rootComponent: RootComponent) {
    KoinContext {
        AppContent(rootComponent)
    }
}