package module

import data.remote.HomeRemoteDataSource
import data.remote.HomeRemoteDataSourceImpl
import data.repository.HomeRepository
import data.repository.HomeRepositoryImpl
import data.service.Service
import org.koin.dsl.module
import presentation.home.viewmodel.HomeViewModel
import usecase.HomeDestinationUseCase
import usecase.HomeProductUseCase

val sharedModule = module {

    factory { Service() }

    single<HomeRemoteDataSource> { HomeRemoteDataSourceImpl(get()) }
    single<HomeRepository> { HomeRepositoryImpl(get()) }

    single { HomeDestinationUseCase(get()) }
    single { HomeProductUseCase(get()) }

    single { HomeViewModel(get(), get()) }
}