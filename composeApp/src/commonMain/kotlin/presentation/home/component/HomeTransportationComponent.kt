package presentation.home.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import yuksewa.composeapp.generated.resources.Res
import yuksewa.composeapp.generated.resources.compose_multiplatform
import yuksewa.composeapp.generated.resources.poppins_semibold


@Composable
fun TransportationComponent() {

    Column(
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Transportation",
            )

            Text(
                text = "Transportation"
            )
        }


        LazyRow(
            modifier = Modifier.padding(top = 12.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            items(5) {
                TransportationItem()
            }
        }
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun TransportationItem() {

    ConstraintLayout(
        modifier = Modifier.height(166.dp).width(200.dp).background(Color.Red)
    ) {
        val (contentCard, imageCard) = createRefs()

        Column(
            modifier = Modifier.constrainAs(contentCard) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
            }
                .height(143.dp)
                .fillMaxWidth()
                .background(Color.Blue)
        ) {
            Text(
                text = "Transportation",
//                fontFamily = FontFamily(Font(Res.font.poppins_semibold))
            )
        }

        Image(
            painter = painterResource(Res.drawable.compose_multiplatform),
            contentDescription = null,
            modifier = Modifier.constrainAs(imageCard) {
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
            }
                .height(100.dp)
                .background(Color.Green)
        )
    }
}