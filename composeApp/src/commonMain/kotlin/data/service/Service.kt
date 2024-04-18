package data.service

import data.response.DestinationResponse
import data.response.ProductResponse
import io.ktor.client.call.body
import io.ktor.client.request.get

internal class Service : KtorService() {

    suspend fun getDestination(): List<DestinationResponse> = client.get {
        pathUrl("destination")
    }.body()

    suspend fun getProduct(): List<ProductResponse> = client.get {
        pathUrl("product")
    }.body()
}