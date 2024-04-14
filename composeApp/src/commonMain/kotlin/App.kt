import androidx.compose.runtime.Composable
import navigation.RootComponent
import org.koin.compose.KoinContext

@Composable
fun App(rootComponent: RootComponent) {
    KoinContext {
        AppContent(rootComponent)
    }
}