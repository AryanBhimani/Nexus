package com.ABMTechnoConsultants.nexus.presentation.Navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ABMTechnoConsultants.nexus.presentation.CallScreen.CallScreen
import com.ABMTechnoConsultants.nexus.presentation.CommunitiesScreen.Communities
import com.ABMTechnoConsultants.nexus.presentation.CommunitiesScreen.CommunitiesScreen
import com.ABMTechnoConsultants.nexus.presentation.UpdateScreen.UpdateScreen
import com.ABMTechnoConsultants.nexus.presentation.homescreen.HomeScreen
import com.ABMTechnoConsultants.nexus.presentation.splashscreen.SplashScreen
import com.ABMTechnoConsultants.nexus.presentation.userregistrationscreen.AuthScreen
import com.ABMTechnoConsultants.nexus.presentation.welcomescreen.Welcomescreen

@Composable
fun WhatsAppNavigationSystem(){

    val navController = rememberNavController()

    NavHost(startDestination = Routes.SplashScreen, navController = navController){
        composable<Routes.SplashScreen> {
            SplashScreen(navController)
        }

        composable<Routes.WelcomeScreen> {
            Welcomescreen(navController)
        }

        composable<Routes.UserRegistrationScreen> {
            AuthScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen()
        }

        composable<Routes.UpdateScreen> {
            UpdateScreen()
        }

        composable<Routes.CommunicationScreen> {
            CommunitiesScreen()
        }

        composable<Routes.CallScreen> {
            CallScreen()
        }

    }
}