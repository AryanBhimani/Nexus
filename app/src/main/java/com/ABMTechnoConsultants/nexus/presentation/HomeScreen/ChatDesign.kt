package com.ABMTechnoConsultants.nexus.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ABMTechnoConsultants.nexus.R
import com.ABMTechnoConsultants.nexus.presentation.chat_box.ChatDesignModel

@Composable
//@Preview(showSystemUi = true)
fun ChatDesign (
 chatDesignModel: ChatDesignModel
){
    Row (modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically){
        Image(
            painter = painterResource(id = chatDesignModel.image),
            contentDescription = null,
            modifier = Modifier
                .size(68.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(12.dp))
        Column {
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text(text = chatDesignModel.name,fontSize = 18.sp,fontWeight = FontWeight.Bold)
                Text(text = chatDesignModel.time, color = Color.Gray)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = chatDesignModel.message, color = Color.Gray, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}