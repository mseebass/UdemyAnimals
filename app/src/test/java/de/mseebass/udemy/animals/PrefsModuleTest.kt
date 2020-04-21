package de.mseebass.udemy.animals

import android.app.Application
import de.mseebass.udemy.animals.di.PrefsModule
import de.mseebass.udemy.animals.util.SharedPreferencesHelper

class PrefsModuleTest(val mockPrefs: SharedPreferencesHelper): PrefsModule() {

    override fun provideSharedPreferences(app: Application): SharedPreferencesHelper {
        return mockPrefs
    }
}