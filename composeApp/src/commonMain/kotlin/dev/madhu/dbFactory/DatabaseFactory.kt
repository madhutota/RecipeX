package dev.madhu.dbFactory

import app.cash.sqldelight.db.SqlDriver

const val DB_FILE_NAME ="recipex.db"
expect class DatabaseFactory {
    suspend fun createDriver(): SqlDriver
}