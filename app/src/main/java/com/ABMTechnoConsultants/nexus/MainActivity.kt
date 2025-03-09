package com.ABMTechnoConsultants.nexus

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.ABMTechnoConsultants.nexus.presentation.Navigation.WhatsAppNavigationSystem
import com.ABMTechnoConsultants.nexus.ui.theme.NexusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NexusTheme {
                WhatsAppNavigationSystem()
            }
        }
    }
}