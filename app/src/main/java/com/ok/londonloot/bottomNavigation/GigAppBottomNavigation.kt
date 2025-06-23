package com.ok.londonloot.bottomNavigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.ok.londonloot.addProduct.AddProduct
import com.ok.londonloot.cameraXScreen.CameraXScreen
import com.ok.londonloot.home.HomeMainApp
import com.ok.londonloot.home.ProductDetailScreen
import com.ok.londonloot.home.RentAnythingScreen
import com.ok.londonloot.home.SellScreen
import com.ok.londonloot.navigation.homeMainNavigation.HomeMainAppScreens
import com.ok.londonloot.profile.ProfileScreenMain
import com.ok.londonloot.ui.theme.LondonLootTheme





@Composable
fun GigAppBottomNavigation(navController: NavHostController?) {

    navController?.let {
        NavHost(it, startDestination = Destination.gigs.route) {
        composable(Destination.gigs.route) {
            HomeMainApp(navController = navController)
        }
        composable(Destination.sell.route) {
            SellScreen(navController = navController)
        }
        composable(Destination.rent.route) {
            RentAnythingScreen(navController = navController)
        }

        composable(
            HomeMainAppScreens.ProductDetailScreen.name+"/{foodId}", arguments = listOf(
                navArgument(name = "foodId") {type = NavType.IntType}
            ),  enterTransition = {
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
                backStackEntry ->
            backStackEntry.arguments?.getInt("foodId")
                ?.let { ProductDetailScreen(navController = navController, it) }
        }

        composable(
            HomeMainAppScreens.AddProductScreen.name,  enterTransition = {
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
                backStackEntry -> backStackEntry.arguments?.let { AddProduct(navController = navController) }
        }

        composable(
            HomeMainAppScreens.CameraXScreen.name,  enterTransition = {
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
                backStackEntry -> backStackEntry.arguments?.let { CameraXScreen(navController = navController) }
        }

        composable(
            HomeMainAppScreens.ProfileMainScreen.name,  enterTransition = {
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
                backStackEntry -> backStackEntry.arguments?.let { ProfileScreenMain(navController = navController) }
        }
    }
    }
}
