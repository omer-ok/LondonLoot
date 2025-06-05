/*
package com.ok.londonloot.mainActivities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ok.londonloot.bottomNavigation.LondonLootAppScreen
import com.ok.londonloot.ui.theme.LondonLootTheme

//@AndroidEntryPoint
class HomeMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    LondonLootTheme(darkTheme = false) {
        Scaffold(modifier = Modifier.wrapContentSize()) { innerPadding ->
            LondonLootAppScreen(modifier = Modifier.padding(innerPadding))
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeMainPreview() {
    LondonLootTheme {
        App()
    }
}*/
