package de.mseebass.udemy.animals.di

import dagger.Module
import dagger.Provides
import de.mseebass.udemy.animals.model.AnimalApi
import de.mseebass.udemy.animals.model.AnimalApiService
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

@Module
open class ApiModule {

    private val BASE_URL = "https://us-central1-apis-4674e.cloudfunctions.net"

    @Provides
    fun provideAnimalAoi() : AnimalApi {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(AnimalApi::class.java)
    }

    @Provides
    open fun provideAnimalService(): AnimalApiService {
        return AnimalApiService()
    }

}