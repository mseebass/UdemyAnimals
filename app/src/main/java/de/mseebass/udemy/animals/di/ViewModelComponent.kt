package de.mseebass.udemy.animals.di

import dagger.Component
import de.mseebass.udemy.animals.viewmodel.ListViewModel
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, PrefsModule::class, AppModule::class])
interface ViewModelComponent { // injects into ViewModel

    fun inject(viewModel: ListViewModel)

}