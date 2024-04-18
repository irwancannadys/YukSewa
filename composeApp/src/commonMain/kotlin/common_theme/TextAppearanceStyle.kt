package common_theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
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

val graySubtitle = Color(0xFF6F7789)
val surfaceBackground = Color(0xFFebf5f4)
val black121212 = Color(0xFF121212)
val tealLogo = Color(0xFF009688)
val teal50 = Color(0xFFE0F2F1)
val teal100 = Color(0xFFB2DFDB)
val teal200 = Color(0xFF80CBC4)
val teal300 = Color(0xFF4DB6AC)
val teal400 = Color(0xFF26A69A)
val teal500 = Color(0xFF009688)


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