package com.ABMTechnoConsultants.nexus.presentation.CallScreen

import android.media.Image

data class Call(
    val image: Int,
    val name: String,
    val time: String,
    val isMissed:Boolean
)