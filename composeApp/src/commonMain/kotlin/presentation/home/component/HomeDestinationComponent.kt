package presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import common_theme.Poppins12Regular
import common_theme.Poppins14Regular
import common_theme.Poppins14SemiBold
import common_theme.Poppins16SemiBold
import common_theme.black121212
import common_theme.graySubtitle
import common_theme.teal200
import data.response.DestinationResponse
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import presentation.home.viewmodel.HomeViewModel
import yuksewa.composeapp.generated.resources.Res
import yuksewa.composeapp.generated.resources.ic_location_material
import yuksewa.composeapp.generated.resources.ic_star_filled


@OptIn(ExperimentalResourceApi::class)
@Composable
fun DestinationComponent(
    viewModel: HomeViewModel
) {

    val response = viewModel.destination.collectAsState()

    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Destinations",
                style = Poppins16SemiBold(),
                color = black121212
            )

            Text(
                text = "See more",
                style = Poppins14Regular(),
                color = teal200
            )
        }


        LazyRow(
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            itemsIndexed(response.value) { index, item ->
                if (index == 0) {
                    Spacer(modifier = Modifier.width(16.dp))
                }

                DestinationItem(item)

                if (index == response.value.size - 1) {
                    Spacer(modifier = Modifier.width(16.dp))
                }
            }
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun DestinationItem(
    destinationResponse: DestinationResponse
) {

    Card(
        modifier = Modifier.padding(bottom = 8.dp).width(200.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 4.dp,
    ) {
        Column(
            modifier = Modifier.background(Color.White).fillMaxWidth()
        ) {
            KamelImage(
                modifier = Modifier.height(120.dp).padding(8.dp),
                resource = asyncPainterResource(destinationResponse.image ?: "-"),
                contentDescription = "Product Image",
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.padding(start = 10.dp),
                    text = destinationResponse.name.toString(),
                    style = Poppins14SemiBold()
                )

                Row(
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(Res.drawable.ic_star_filled),
                        contentDescription = "Star",
                        modifier = Modifier.width(12.dp).height(12.dp)
                    )

                    Text(
                        modifier = Modifier.padding(start = 2.dp, end = 10.dp),
                        text = "4.8",
                        style = Poppins12Regular(),
                        color = graySubtitle
                    )
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth().padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically

            ) {
                Image(
                    painter = painterResource(Res.drawable.ic_location_material),
                    contentDescription = "location",
                    modifier = Modifier.width(16.dp).height(16.dp)
                )

                Text(
                    modifier = Modifier.padding(start = 4.dp),
                    text = destinationResponse.locationPlace.toString(),
                    style = Poppins12Regular(),
                    color = graySubtitle
                )
            }
        }
    }
}