package com.ABMTechnoConsultants.nexus.presentation.userregistrationscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.foundation.text2.input.rememberTextFieldState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ABMTechnoConsultants.nexus.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen (){

    var expanded by remember {
        mutableStateOf(false)
    }

    var selectedCountry by remember {
        mutableStateOf("india")
    }

    var countryCode by remember{
        mutableStateOf("+91")
    }

    var phoneNumber by remember {
        mutableStateOf("")
    }

    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Enter Your Phone Number",
            fontSize = 25.sp,
            color = colorResource(id = R.color.green),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(25.dp))
        Row {
            Text(text = "WhatsApp Will Need To Verify Your Phone Number")
            Spacer(modifier = Modifier.width(4.dp))
            Text(text = "What's", color = colorResource(id = R.color.dark_green))
        }
        Text(text = "My Number?", color = colorResource(id = R.color.dark_green))
        Spacer(modifier = Modifier.height(25.dp))
        TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(230.dp)){
                Text(text = selectedCountry, modifier = Modifier.align(Alignment.Center), fontSize = 16.sp, color = Color.Black)
                Icon(
                    imageVector = Icons.Default.ArrowDropDown ,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(id = R.color.green)
                )
            }
        }
        HorizontalDivider(modifier = Modifier.padding(horizontal = 66.dp) , thickness = 2.dp, color = colorResource(id = R.color.green))
        DropdownMenu(expanded = expanded, onDismissRequest = {expanded = false}, modifier = Modifier.fillMaxWidth()) {
            listOf("Inida", "USA" , "UK" , "Japan").forEach{ country ->
                DropdownMenuItem(text = { Text(text = country)}, onClick = {
                    selectedCountry = country
                    expanded = false
                })
            }
        }

        Column( modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Row {
                TextField(
                    value = countryCode,
                    onValueChange = {
                        countryCode = it
                    } ,
                    modifier = Modifier.width(70.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(id = R.color.green),
                        focusedIndicatorColor = colorResource(id = R.color.green)
                    )
                )
                Spacer(modifier = Modifier.width(6.dp))
                TextField(value = phoneNumber, onValueChange = {
                        phoneNumber = it
                    },
                    placeholder = { Text(text = "Phone Number")},
                    singleLine = true,
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(id = R.color.green),
                        focusedIndicatorColor = colorResource(id = R.color.green)
                    )
                )
            }
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "carrier cherges may apply",
                fontSize = 12.sp,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
            )
            Spacer(modifier = Modifier.height(25.dp))
            Button(
                onClick = { /*TODO*/ },  modifier = Modifier.size(290.dp, 45.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.dark_green),
                    contentColor = colorResource(id = R.color.white)
                )
            ) {
                Text(text = "Next", fontSize = 16.sp)
            }
        }
//        Spacer(modifier = Modifier.height(25.dp))
    }
}