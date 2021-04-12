package com.njm.firstanimation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Place(
        val name: String,
        val description: String,
        val imgPlace: List<Int>,
        val ubicacion: String,
        val superficie: String,
        val poblacion: String,
        val author: Author
): Parcelable