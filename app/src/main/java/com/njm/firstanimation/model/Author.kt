package com.njm.firstanimation.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Author(
    val name: String,
    val imgProfile: Int,
    val recommendationPlace: String
) : Parcelable