package presentation.home.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


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
                text = "Transportation"
            )

            Text(
                text = "Lihat Semua"
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

@Composable
fun TransportationItem() {




    Card {
        Text(
            modifier = Modifier.padding(16.dp),
            text = "Mobil"
        )
    }
}