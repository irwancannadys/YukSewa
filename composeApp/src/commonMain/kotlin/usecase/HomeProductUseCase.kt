package usecase

import data.repository.HomeRepository
import data.response.ProductResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeProductUseCase(
    private val repository: HomeRepository
) {

    suspend operator fun invoke() : Flow<List<ProductResponse>> {
        return flow {
            emit(repository.getProduct())
        }
    }
}