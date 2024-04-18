@file:OptIn(ExperimentalMaterial3Api::class)

package presentation.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarColors
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import common_component.HomeAppBarComponent
import common_theme.Poppins12Regular
import common_theme.black121212
import common_theme.graySubtitle
import common_theme.surfaceBackground
import common_theme.teal50
import navigation.screen_component.HomeScreenComponent
import org.koin.compose.koinInject
import presentation.home.component.DestinationComponent
import presentation.home.component.HomeTransportationComponent
import presentation.home.viewmodel.HomeViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(component: HomeScreenComponent) {

    val viewModel: HomeViewModel = koinInject()
    viewModel.getDestination()
    viewModel.getProduct()

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
                Column(
                    modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)
                ) {
                    SearchBar(
                        modifier = Modifier.fillMaxWidth(),
                        query = "",
                        active = false,
                        onActiveChange = {},
                        onQueryChange = {},
                        onSearch = {},
                        leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
                        placeholder = { Text("Find for what you want..", style = Poppins12Regular(), color = graySubtitle)},
                        colors = SearchBarDefaults.colors(
                            containerColor = surfaceBackground,
                            dividerColor = black121212,
                        )
                    ){}
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }

            item(span = itemSpan) {
                DestinationComponent(
                    viewModel = viewModel
                )
            }

            item(span = itemSpan) {
                Spacer(modifier = Modifier.height(16.dp))
            }

            item(span = itemSpan) {
                HomeTransportationComponent(
                    viewModel = viewModel
                )
            }
        }
    }
}
