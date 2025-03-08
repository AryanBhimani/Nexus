package com.ABMTechnoConsultants.nexus.presentation.splashscreen

import android.window.SplashScreen
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.ABMTechnoConsultants.nexus.R
import com.ABMTechnoConsultants.nexus.presentation.Navigation.Routes
import kotlinx.coroutines.delay

@Composable
//@Preview(showSystemUi = true)
fun SplashScreen(navHostController: NavHostController) {

    LaunchedEffect(Unit) {
        delay(1000)
        navHostController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.SplashScreen>{
                inclusive = true
            }
        }
    }

    Box(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.whatsapp_icon), contentDescription = null, modifier = Modifier
            .size(80.dp)
            .align(Alignment.Center))
        Column (modifier =  Modifier.align(Alignment.BottomCenter), horizontalAlignment = Alignment.CenterHorizontally){
            Text(text = "Aryan Bhimani", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Row {
                Icon(
                    painter = painterResource(id = R.drawable.meta),
                    contentDescription = null,
                    modifier = Modifier.size(24.dp),
                    tint = colorResource(id = R.color.green)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "Meta", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            }
        }
    }
}