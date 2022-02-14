package fr.isen.alves.androidrestaurant.network

import com.google.gson.annotations.SerializedName
import fr.isen.alves.androidrestaurant.Ingredient
import fr.isen.alves.androidrestaurant.Price
import java.io.Serializable

class Dish(
    @SerializedName("name_fr") val name: String,
    @SerializedName("images") val images: List<String>,
    @SerializedName("ingredients") val ingredients: List<Ingredient>,
    @SerializedName("prices") val prices: List<Price>
    ): Serializable {
        fun getThumbnailURL(): String?  {
            return if(images.isNotEmpty() && images.first().isNotEmpty()) {
                images.first()
            } else {
                null
            }
        }
}