package presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import common_theme.Poppins12Regular
import common_theme.Poppins14SemiBold
import common_theme.Poppins16SemiBold
import common_theme.Poppins18SemiBold
import common_theme.Poppins22SemiBold
import common_theme.black121212
import common_theme.graySubtitle
import common_theme.teal300
import data.response.ProductResponse
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import presentation.home.viewmodel.HomeViewModel
import yuksewa.composeapp.generated.resources.Res
import yuksewa.composeapp.generated.resources.compose_multiplatform


@Composable
fun HomeTransportationComponent(
    viewModel: HomeViewModel
) {
    val response = viewModel.product.collectAsState()

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            modifier = Modifier.padding(start = 16.dp, bottom = 8.dp),
            text = "Book Now",
            style = Poppins16SemiBold(),
            color = black121212
        )

        response.value.forEach {
            TransportationItem(it)
        }

    }
}

@Composable
fun TransportationItem(
    productResponse: ProductResponse
) {

    Card(
        elevation = 8.dp,
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        ConstraintLayout(
            modifier = Modifier.fillMaxWidth()
        ) {
            val (productName,
                textStartFrom,
                textPrice,
                ivProduct
            ) = createRefs()

            Text(
                modifier = Modifier.constrainAs(productName) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                    .padding(start = 16.dp, top = 12.dp),
                text = productResponse.name.toString(),
                style = Poppins18SemiBold(),
                color = black121212
            )

            Text(
                modifier = Modifier.constrainAs(textStartFrom) {
                    top.linkTo(productName.bottom)
                    start.linkTo(parent.start)
                }
                    .padding(start = 16.dp, top = 8.dp),
                text = "Start from",
                style = Poppins12Regular(),
                color = teal300
            )

            Text(
                modifier = Modifier.constrainAs(textPrice) {
                    top.linkTo(textStartFrom.bottom)
                    start.linkTo(parent.start)
                }
                    .padding(start = 16.dp, top = 2.dp),
                text = productResponse.startPrice.toString(),
                style = Poppins14SemiBold(),
                color = graySubtitle
            )

            KamelImage(
                modifier = Modifier
                    .constrainAs(ivProduct) {
                        end.linkTo(parent.end)
                        bottom.linkTo(parent.bottom)
                    }
                    .width(100.dp)
                    .height(100.dp)
                    .padding(end = 16.dp, bottom = 12.dp),
                resource = asyncPainterResource(productResponse.image ?: "-"),
                contentDescription = "Product Image",
            )
        }
    }

}