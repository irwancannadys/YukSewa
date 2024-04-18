package presentation.home.viewmodel

import data.response.DestinationResponse
import data.response.ProductResponse
import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import usecase.HomeDestinationUseCase
import usecase.HomeProductUseCase

class HomeViewModel(
    private val homeDestinationUseCase: HomeDestinationUseCase,
    private val homeProductUseCase: HomeProductUseCase
) : ViewModel() {

    private val _destination = MutableStateFlow<List<DestinationResponse>>(listOf())
    val destination = _destination.asStateFlow()

    private val _product = MutableStateFlow<List<ProductResponse>>(listOf())
    val product = _product.asStateFlow()

    fun getDestination() = viewModelScope.launch {
        homeDestinationUseCase.invoke().collect { destination ->
            _destination.update {
                destination
            }
        }
    }

    fun getProduct() = viewModelScope.launch {
        homeProductUseCase.invoke().collect { product ->
            _product.update {
                product
            }
        }
    }
}