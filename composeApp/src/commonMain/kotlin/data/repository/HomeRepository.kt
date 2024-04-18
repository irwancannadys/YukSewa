package data.repository

import data.response.DestinationResponse
import data.response.ProductResponse
import kotlinx.coroutines.flow.Flow

interface HomeRepository {
    suspend fun getDestination(): List<DestinationResponse>

    suspend fun getProduct(): List<ProductResponse>

}