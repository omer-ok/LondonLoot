package com.ok.londonloot.bottomNavigation

import com.ok.londonloot.R


sealed class Destination(val route: String, val icon: Int, val title: String) {


    data object  gigs : Destination(
        route = "gigs",
        icon = R.drawable.instant_transfer,
        title = "Flash Gigs"
    )

    data object sell : Destination(
        route = "sell",
        icon = R.drawable.sell,
        title = "Sell Fast"
    )

    data object rent : Destination(
        route = "rent",
        icon = R.drawable.rent,
        title = "Rent"
    )

    companion object{
      val toList = listOf(gigs, sell, rent)
    }
}