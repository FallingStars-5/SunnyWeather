package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status:String, val places:List<Place>)

data class Place(val name:String, val location: Location,
                 @SerializedName("formatted_address") val address: String)  //注解，表示formatted_address对应于address

data class Location(val lng: String, val lat:String)
