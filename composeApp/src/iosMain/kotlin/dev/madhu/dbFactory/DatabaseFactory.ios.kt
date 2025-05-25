package dev.madhu.dbFactory

import app.cash.sqldelight.async.coroutines.synchronous
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.native.NativeSqliteDriver
import dev.madhu.recipeappcmp.RecipexAndroidDatabase

actual class DatabaseFactory {
    actual suspend fun createDriver(): SqlDriver {
        return NativeSqliteDriver(
            RecipexAndroidDatabase.Schema.synchronous(), DB_FILE_NAME
        )
    }
}