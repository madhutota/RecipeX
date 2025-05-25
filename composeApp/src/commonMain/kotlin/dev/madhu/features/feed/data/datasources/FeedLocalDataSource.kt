package dev.madhu.features.feed.data.datasources

import dev.madhu.features.common.domain.entities.Recipe

interface FeedLocalDataSource {

   suspend fun getRecipeList():List<Recipe>
}