package navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable
import navigation.screen_component.HomeScreenComponent

class RootComponent(componentContext: ComponentContext): ComponentContext by componentContext {

    private val navigation = StackNavigation<Configuration>()

    val childStack = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.HomeScreen,
        handleBackButton = true,
        childFactory = ::createChild
    )

    private fun createChild(
        configuration: Configuration,
        componentContext: ComponentContext
    ): Child {
        return when (configuration) {
            is Configuration.HomeScreen -> Child.HomeScreen(
                HomeScreenComponent(
                    componentContext = componentContext
                )
            )
        }
    }

    sealed class Child {
        data class HomeScreen(val componentContext: HomeScreenComponent) : Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object HomeScreen : Configuration()
    }
}