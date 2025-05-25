package dev.madhu.app

import android.app.Application
import dev.madhu.dbFactory.DatabaseFactory
import dev.madhu.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

class RecipeApp : Application() {
    private var androidModules = module {
        single { DatabaseFactory(applicationContext) }
    }

    override fun onCreate() {
        super.onCreate()
        initKoin(additionalModule = listOf(androidModules)) {
            androidContext(applicationContext)
        }
    }
}