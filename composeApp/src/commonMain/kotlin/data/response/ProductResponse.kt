package data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class ProductResponse(
    @SerialName("name")
    val name: String?,
    @SerialName("image_url")
    val image: String?,
    @SerialName("start_price")
    val startPrice: String?
)
