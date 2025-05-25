package dev.madhu.features.feed.data.datasources

import dev.madhu.features.common.domain.entities.Recipe

class FeedLocalDataSourceImpl:FeedLocalDataSource {
    override suspend fun getRecipeList(): List<Recipe> {
        TODO()
    }


}