package dev.madhu.features.common.data.dto

import kotlinx.serialization.SerialName

class RecipeApiResponseDTO(

    @SerialName("meals")
    var meals: List<RecipeDTO>

)