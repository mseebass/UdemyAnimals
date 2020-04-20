package de.mseebass.udemy.animals.di

import dagger.Component
import de.mseebass.udemy.animals.viewmodel.ListViewModel

@Component(modules = [ApiModule::class])
interface ViewModelComponent { // injects into ViewModel

    fun inject(viewModel: ListViewModel)

}