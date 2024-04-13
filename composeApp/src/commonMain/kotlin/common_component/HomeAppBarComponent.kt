package common_component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import yuksewa.composeapp.generated.resources.Res
import yuksewa.composeapp.generated.resources.logo


@OptIn(ExperimentalResourceApi::class)
@Composable
fun HomeAppBarComponent() {

    Row(
        modifier = Modifier.padding(horizontal = 10.dp).fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            modifier = Modifier.height(55.dp).width(120.dp),
            painter = painterResource(Res.drawable.logo),
            contentDescription = "icon",
            contentScale = ContentScale.FillWidth
        )

        Icon(
            modifier = Modifier.padding(end = 8.dp),
            imageVector = Icons.Rounded.Settings,
            contentDescription = null
        )
    }
}