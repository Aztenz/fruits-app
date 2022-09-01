package com.example.fruits_app

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Fruit(val fruitName: String?, val fruitImageModelNumber: Int, val description: String?) :
    Parcelable