package fr.isen.alves.androidrestaurant.network

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class UserResult(@SerializedName("data") val data: User?) {}

class User(@SerializedName("id")val id: Int): Serializable {}