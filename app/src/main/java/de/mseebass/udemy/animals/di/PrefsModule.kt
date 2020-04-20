package de.mseebass.udemy.animals.di

import android.app.Application
import dagger.Module
import dagger.Provides
import de.mseebass.udemy.animals.util.SharedPreferencesHelper
import javax.inject.Singleton

@Module
class PrefsModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return SharedPreferencesHelper(app)
    }

}