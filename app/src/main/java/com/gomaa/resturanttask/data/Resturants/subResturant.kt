package com.gomaa.resturanttask.data.Resturants

import com.squareup.moshi.Json

data class subResturant(
    @Json(name = "RestauranthId")
    override val restaurantId:Int,
    @Json(name = "name")
    override val restaurantName: String,
    @Json(name = "logo")
    override val restaurantLogo: String,
    @Json(name = "cover")
    override val restaurantCover: String,
    @Json(name = "cuisines")
    override val cuisines: List<Cuisines>
):BaseRestaurant

