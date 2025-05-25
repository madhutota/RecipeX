package dev.madhu.di

import dev.madhu.features.common.data.api.httpClient
import io.ktor.client.HttpClient
import org.koin.dsl.module

fun networkModule() = module {

    single<HttpClient> {
        httpClient
    }
}