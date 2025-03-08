package com.ABMTechnoConsultants.nexus.presentation.CallScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ABMTechnoConsultants.nexus.R
import com.ABMTechnoConsultants.nexus.presentation.UpdateScreen.TopBar
import com.ABMTechnoConsultants.nexus.presentation.bottomnavigation.BottomNavigation

@Composable
@Preview(showSystemUi = true)
fun CallScreen(){

    val sampleCall = listOf(
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = true,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = true,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = true,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = true,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        ),
        Call(
            image = R.drawable.meta,
            name = "Aryan bhimani",
            isMissed = false,
            time = "Yesterday, 11:11AM",
        )
    )

    var isSearching by remember {
        mutableStateOf(false)
    }

    var search by remember {
        mutableStateOf("")
    }

    var shawMenu by remember {
        mutableStateOf(false)
    }

    Scaffold (topBar = {
        Box(modifier = Modifier.fillMaxWidth()) {
            Column {
                Row {
                    if (isSearching) {
                        TextField(value = search, onValueChange = {
                            search = it
                        }, placeholder = {
                            Text(text = "Search")
                        }, colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                        ), modifier = Modifier.padding(start = 12.dp), singleLine = true
                        )
                    } else {
                        Text(
                            text = "Call",
                            fontSize = 28.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(start = 12.dp, top = 4.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                    if (isSearching) {
                        IconButton(onClick = {
                            isSearching = false
                            search = ""
                        }) {
                            Icon(
                                painter = painterResource(id = R.drawable.cross),
                                contentDescription = null,
                                modifier = Modifier.size(15.dp)
                            )
                        }
                    } else {
                        IconButton(onClick = { isSearching = true }) {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                        }
                        IconButton(onClick = {
                            shawMenu = true
                        }) {
                            Icon(
                                painter = painterResource(id = R.drawable.more),
                                contentDescription = null,
                                modifier = Modifier.size(24.dp)
                            )
                            DropdownMenu(
                                expanded = shawMenu,
                                onDismissRequest = { shawMenu = false }) {
                                DropdownMenuItem(
                                    text = { Text(text = "Settings") },
                                    onClick = { shawMenu = false })
                            }
                        }

                    }
                }
                HorizontalDivider()
            }
        }
    },
        bottomBar= {
            BottomNavigation()
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(painter = painterResource(id = R.drawable.add_call), contentDescription = null)
            }
        },

    ){
        Column (modifier = Modifier.padding(it)){
            Spacer(modifier = Modifier.height(16.dp))
            FavoritesSection()

            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        id = R.color.green
                    )
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Start a new call", color = Color.White, /*TODO*/fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Recent Calls",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )
            LazyColumn {
                items(sampleCall){ data->
                    CallItemDesign(data)
                }
            }

        }
    }
}