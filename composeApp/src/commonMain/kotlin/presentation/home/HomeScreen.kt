package presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import common_component.HomeAppBarComponent
import navigation.screen_component.HomeScreenComponent
import presentation.home.component.TransportationComponent


@Composable
fun HomeScreen(
    component: HomeScreenComponent
) {

    Scaffold(
        topBar = { HomeAppBarComponent() }
    ) {
        val cols = remember { 2 }
        val itemSpan: (LazyGridItemSpanScope) -> GridItemSpan = remember(cols) {
            { GridItemSpan(cols) }
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(cols)
        ) {
            item(span = itemSpan) {
                TransportationComponent()
            }
        }
    }
}
