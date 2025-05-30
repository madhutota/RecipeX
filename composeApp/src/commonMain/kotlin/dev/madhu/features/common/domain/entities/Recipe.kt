package dev.madhu.features.common.domain.entities

class Recipe(
    val id: Long,
    val title: String,
    val description: String,
    val category: String,
    val area: String,
    val imageUrl: String,
    val youtubeLink: String,
    val ingredients: List<String>,
    val instructions: List<String>,
    val isFavorite: Boolean,
    val rating: Long,
    val duration: String = "20 Mins",
    val difficulty: String = "Easy"
)