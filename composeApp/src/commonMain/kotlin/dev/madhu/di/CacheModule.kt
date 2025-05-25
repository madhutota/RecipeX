package dev.madhu.di

import dev.madhu.features.common.data.database.DbHelper
import dev.madhu.features.common.data.database.dao.RecipeDAO
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import org.koin.dsl.module
import kotlin.coroutines.CoroutineContext
import kotlin.math.sin

fun cacheModule() = module {
    single<CoroutineContext> { Dispatchers.Default }
    single { CoroutineScope(get()) }
    single { DbHelper(get()) }
    single { RecipeDAO(get()) }

}