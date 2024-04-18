package usecase

import data.repository.HomeRepository
import data.response.DestinationResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class HomeDestinationUseCase(
    private val homeRepository: HomeRepository
) {

    suspend operator fun invoke() : Flow<List<DestinationResponse>> {
        return flow {
            emit(homeRepository.getDestination())
        }
    }
}