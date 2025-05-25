package dev.madhu

import dev.madhu.dbFactory.DatabaseFactory
import dev.madhu.di.initKoin
import org.koin.dsl.module

val iosModules = module {
    single { DatabaseFactory() }
}


fun initKoinIOS() = initKoin(
    additionalModule = listOf(iosModules)
)