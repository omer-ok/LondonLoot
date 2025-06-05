package com.ok.londonloot.navigation.onBoardingNavigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ok.londonloot.onboarding.CountryInfoScreen
import com.ok.londonloot.onboarding.LoginWelcomeScreen
import com.ok.londonloot.onboarding.OtpVerificationScreen
import com.ok.londonloot.onboarding.SignUpScreen

@Composable
fun LondonLootOnBoardingNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = LondonLootOnBoardingScreens.LoginWelcomeScreen.name){
        composable(LondonLootOnBoardingScreens.LoginWelcomeScreen.name){
            LoginWelcomeScreen(navController = navController)
        }
        composable(LondonLootOnBoardingScreens.SignUpScreen.name,  enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            }){
            SignUpScreen(navController = navController)
        }
        composable(LondonLootOnBoardingScreens.CountryCodeSelectionScreen.name,  enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            }){backStackEntry ->
            val countryCode = backStackEntry.savedStateHandle.getStateFlow(
                "countryCode",
                initialValue = false,
            ).collectAsState().value
            CountryInfoScreen(navController = navController)
        }
        composable(LondonLootOnBoardingScreens.OtpVerificationScreen.name,  enterTransition = {
            slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left,
                animationSpec = tween(500)
            )
        },
            exitTransition = {
                slideOutOfContainer(
                    AnimatedContentTransitionScope.SlideDirection.Right,
                    animationSpec = tween(500)
                )
            }){
            OtpVerificationScreen(navController = navController)
        }
    }
}

