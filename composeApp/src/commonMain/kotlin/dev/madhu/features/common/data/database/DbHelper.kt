package dev.madhu.features.common.data.database

import dev.madhu.dbFactory.DatabaseFactory
import dev.madhu.recipeappcmp.RecipexAndroidDatabase
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock

class DbHelper(
    private val databaseFactory: DatabaseFactory
) {

    private var db: RecipexAndroidDatabase? = null
    private var mutex = Mutex()


    suspend fun <Result : Any> withDateBase(block: suspend (RecipexAndroidDatabase) -> Result) =
        mutex.withLock {

            if (db == null) {
                db = createDb(databaseFactory)
            }
            return@withLock block(db!!)
        }


    private suspend fun createDb(databaseFactory: DatabaseFactory): RecipexAndroidDatabase {
        return RecipexAndroidDatabase(databaseFactory.createDriver())

    }

}