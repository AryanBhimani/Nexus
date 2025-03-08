package com.ABMTechnoConsultants.nexus.presentation.CallScreen

import android.media.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ABMTechnoConsultants.nexus.R

@Composable
@Preview(showSystemUi = true)
fun FavoritesSection (){

    val sampleFavorite = listOf(
        FavoriteContact(
            image = R.drawable.meta,
            name = "Aryan Bhimani"
        ),
        FavoriteContact(
            image = R.drawable.meta,
            name = "Aryan Bhimani"
        ),
        FavoriteContact(
            image = R.drawable.meta,
            name = "Aryan Bhimani"
        ),
        FavoriteContact(
            image = R.drawable.meta,
            name = "Aryan Bhimani"
        )
    )

    Column (modifier = Modifier.padding(start = 16.dp, bottom = 8.dp)){
        Text(text = "Favorites", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier =  Modifier.padding(bottom = 8.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .horizontalScroll(rememberScrollState())) {
            sampleFavorite.forEach{
                FavoritesItem(it)
            }
        }
    }
}


data class FavoriteContact(
    val image: Int,
    val name: String
)