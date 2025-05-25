package dev.madhu.features.feed.data.datasources

import dev.madhu.features.common.domain.entities.Recipe

class FeedRemoteDataSourceImpl : FeedRemoteDataSource {
    override suspend fun getRecipeList(): List<Recipe> {
        TODO("Not yet implemented")
    }

}