package navigation.event

sealed interface HomeScreenEvent{
    data object OnProductClicked : HomeScreenEvent
}