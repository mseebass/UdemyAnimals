package de.mseebass.udemy.animals

import de.mseebass.udemy.animals.di.ApiModule
import de.mseebass.udemy.animals.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService): ApiModule() {
    override fun provideAnimalService(): AnimalApiService {
        return mockService
    }
}