package com.ok.londonloot.navigation.onBoardingNavigation

enum class LondonLootOnBoardingScreens {
    LoginWelcomeScreen,
    SignUpScreen,
    CountryCodeSelectionScreen,
    OtpVerificationScreen;

    companion object {
        fun fromRoute(route:String?): LondonLootOnBoardingScreens
        = when(route?.substringBefore("/")){
            LoginWelcomeScreen.name -> LoginWelcomeScreen
            SignUpScreen.name -> SignUpScreen
            CountryCodeSelectionScreen.name -> CountryCodeSelectionScreen
            OtpVerificationScreen.name -> OtpVerificationScreen
            null -> LoginWelcomeScreen
            else -> throw IllegalArgumentException("Route $route ia not recognized")
        }
    }
}