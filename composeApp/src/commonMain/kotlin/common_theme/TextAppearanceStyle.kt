package common_theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import yuksewa.composeapp.generated.resources.Res
import yuksewa.composeapp.generated.resources.poppins_regular
import yuksewa.composeapp.generated.resources.poppins_semibold

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins12Regular() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_regular)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 12.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins14Regular() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_regular)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 14.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins16Regular() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_regular)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 16.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins14SemiBold() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_semibold)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 14.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins16SemiBold() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_semibold)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 16.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins18SemiBold() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_semibold)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 18.sp
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun Poppins22SemiBold() = TextStyle(
    fontFamily = FontFamily(Font(Res.font.poppins_semibold)),
    fontWeight = FontWeight.Normal,
    fontStyle = FontStyle.Normal,
    fontSize = 22.sp
)