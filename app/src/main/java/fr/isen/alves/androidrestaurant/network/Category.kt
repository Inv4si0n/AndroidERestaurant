package fr.isen.alves.androidrestaurant.network

import com.google.gson.annotations.SerializedName
import fr.isen.alves.androidrestaurant.network.Dish
import java.io.Serializable

class Category(
    @SerializedName("name_fr") val name: String,
    @SerializedName("items") val items: List<Dish>
): Serializable {}