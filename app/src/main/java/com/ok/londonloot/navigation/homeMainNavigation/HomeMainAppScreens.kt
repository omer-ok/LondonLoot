package com.ok.londonloot.navigation.homeMainNavigation


enum class HomeMainAppScreens {
    HomeMainScreen,
    AddProductScreen,
    CameraXScreen,
    ProductDetailScreen,
    ProfileMainScreen;
    companion object {
        fun fromRoute(route:String?): HomeMainAppScreens = when(route?.substringBefore("/")){
            HomeMainScreen.name -> HomeMainScreen
            AddProductScreen.name -> AddProductScreen
            CameraXScreen.name -> CameraXScreen
            ProductDetailScreen.name -> ProductDetailScreen
            ProfileMainScreen.name -> ProfileMainScreen
            null -> HomeMainScreen
            else -> throw IllegalArgumentException("Route $route ia not recognized")
        }
    }
}