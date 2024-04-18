package data.repository

import data.remote.HomeRemoteDataSource
import data.response.DestinationResponse
import data.response.ProductResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeRepositoryImpl(
    private val homeRemoteDataSource: HomeRemoteDataSource
) : HomeRepository {

    override suspend fun getDestination(): List<DestinationResponse> {
        return homeRemoteDataSource.getDestination()
    }

    override suspend fun getProduct(): List<ProductResponse> {
        return homeRemoteDataSource.getProduct()
    }
}