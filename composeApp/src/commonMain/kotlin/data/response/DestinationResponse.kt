package data.response

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DestinationResponse(
    @SerialName("name")
    val name: String?,
    @SerialName("image_url")
    val image: String?,
    @SerialName("location_place")
    val locationPlace: String?
)
