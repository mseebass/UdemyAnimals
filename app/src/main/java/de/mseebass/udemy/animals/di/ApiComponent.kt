package de.mseebass.udemy.animals.di

import dagger.Component
import de.mseebass.udemy.animals.model.AnimalApiService

@Component(modules = [ApiModule::class])
interface ApiComponent { // injects into AnimalApiService

    fun inject(service: AnimalApiService)
}