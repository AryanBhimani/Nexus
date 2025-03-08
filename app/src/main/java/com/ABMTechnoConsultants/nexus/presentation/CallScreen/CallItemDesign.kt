package com.ABMTechnoConsultants.nexus.presentation.CallScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ABMTechnoConsultants.nexus.R

@Composable
//@Preview(showSystemUi = true)
fun CallItemDesign(call: Call){

//    val isMissed by remember {
//        mutableStateOf(true)
//    }

    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically,
    ){
        Image(
            painter = painterResource(id = call.image),
            contentDescription = "Aryan Bhimani",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = call.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Row {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_call_missed_24),
                    contentDescription = null,
                    modifier = Modifier.size(16.dp),
                    tint = if (call.isMissed) Color.Red else colorResource(id = R.color.green)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(text = call.time, fontSize = 15.sp, color = Color.Gray)
            }
        }
        Box(modifier = Modifier.fillMaxWidth()){
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.CenterEnd)) {
                Icon(painter = painterResource(id = R.drawable.telephone), contentDescription = null, modifier = Modifier.size(24.dp))
            }
        }
    }
}