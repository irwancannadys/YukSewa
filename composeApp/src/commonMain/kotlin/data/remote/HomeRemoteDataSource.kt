package data.remote

import data.response.DestinationResponse
import data.response.ProductResponse
import kotlinx.coroutines.flow.Flow

interface HomeRemoteDataSource {

    suspend fun getDestination(): List<DestinationResponse>

    suspend fun getProduct(): List<ProductResponse>
}