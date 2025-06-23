package com.ok.londonloot.bottomNavigation

import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ok.londonloot.R
import com.ok.londonloot.ui.theme.LondonLootTheme


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeMainAppNavigationPreview() {
    LondonLootTheme {
        BottomNavigationBar(null,null)
    }
}

@Composable
fun BottomNavigationBar(navController: NavController?, appItems: List<Destination>?) {
    NavigationBar(
        containerColor = colorResource(id = R.color.white),
    ){
        val navBackStackEntry by navController!!.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        appItems?.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(modifier = Modifier
                        .requiredHeight(30.dp)
                        .requiredWidth(30.dp),
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title
                    )
                },
                colors = NavigationBarItemColors(
                    selectedIconColor = colorResource(id = R.color.white),
                    unselectedIconColor = colorResource(id = R.color.black),
                    selectedTextColor = colorResource(id = R.color.button_color),
                    unselectedTextColor = colorResource(id = R.color.black),
                    selectedIndicatorColor = colorResource(id = R.color.fade_blue_color),
                    disabledIconColor = colorResource(id = R.color.black),
                    disabledTextColor = colorResource(id = R.color.black)
                ),
                alwaysShowLabel = true,
                label = { Text(text = item.title) },
                selected = currentRoute == item.route,
                onClick = {
                    navController?.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}