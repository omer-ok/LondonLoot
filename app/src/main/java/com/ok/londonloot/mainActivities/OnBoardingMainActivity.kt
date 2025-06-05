package com.ok.londonloot.mainActivities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ok.londonloot.navigation.onBoardingNavigation.LondonLootOnBoardingNavigation
import com.ok.londonloot.ui.theme.LondonLootTheme

class OnBoardingMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            LondonLootTheme(darkTheme = false) {
                LondonLootOnBoardingNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EatExpressPreview() {
    LondonLootTheme {
        LondonLootOnBoardingNavigation()
    }
}
