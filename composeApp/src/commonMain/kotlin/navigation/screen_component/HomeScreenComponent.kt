package navigation.screen_component

import com.arkivanov.decompose.ComponentContext
import navigation.event.HomeScreenEvent

class HomeScreenComponent(componentContext: ComponentContext) :
    ComponentContext by componentContext {

    fun onEvent(event: HomeScreenEvent) {
        when (event) {
            is HomeScreenEvent.OnProductClicked -> {
                // Handle event
            }
        }
    }
}