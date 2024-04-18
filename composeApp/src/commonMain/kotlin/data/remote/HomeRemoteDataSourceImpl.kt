package data.remote

import data.response.DestinationResponse
import data.response.ProductResponse
import data.service.Service
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

internal class HomeRemoteDataSourceImpl(
    private val apiService: Service
) : HomeRemoteDataSource {

    override suspend fun getDestination(): List<DestinationResponse> {
        return apiService.getDestination()
    }

    override suspend fun getProduct(): List<ProductResponse> {
        return apiService.getProduct()
    }
}