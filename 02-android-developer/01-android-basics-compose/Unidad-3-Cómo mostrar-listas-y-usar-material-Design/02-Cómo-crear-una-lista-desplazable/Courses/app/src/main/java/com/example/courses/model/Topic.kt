package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val nombreResId: Int,
    val cantidad: Int,
    @DrawableRes val imagenResId: Int
)