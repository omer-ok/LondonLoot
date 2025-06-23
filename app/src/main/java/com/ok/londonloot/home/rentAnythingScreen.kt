package com.ok.londonloot.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.ok.londonloot.R
import com.ok.londonloot.models.GigData
import com.ok.londonloot.models.RentItemsData
import com.ok.londonloot.models.getGigData
import com.ok.londonloot.models.getRentItemsData
import com.ok.londonloot.navigation.homeMainNavigation.HomeMainAppScreens
import com.ok.londonloot.ui.theme.LondonLootTheme



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RentAnythingScreenPreview() {
    LondonLootTheme {
        RentAnythingScreen(null)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RentAnythingScreen(navController: NavController?){
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(rememberTopAppBarState())

    Column(modifier = Modifier
        .fillMaxSize()){
        Scaffold(
            modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection)
                .fillMaxSize(),
            topBar = { AddAppBar(navController, scrollBehavior) },
            content = { padding ->
                Surface(
                    modifier = Modifier.padding(padding)
                        .fillMaxSize(),
                    color = colorResource(R.color.white)
                ) {
                    Column(modifier = Modifier) {
                        //Box(modifier = Modifier.height(20.dp)) {  }
                        Text(modifier = Modifier
                            .padding(16.dp, 10.dp, 16.dp, 16.dp)
                            .align(Alignment.Start),
                            text = "Flash Rent products for Cash",
                            style = TextStyle(
                                fontSize = 15.sp,
                                lineHeight = 27.sp,
                                fontFamily = FontFamily(Font(R.font.lexend_deca_semi_bold)),
                                fontWeight = FontWeight(600),
                                color = colorResource(R.color.black),
                            )
                        )
                        RentItemList(navController)
                    }
                }
            }
        )
    }
}


@Composable
fun RentItemList(navController: NavController?, rentItemList: List<RentItemsData> = getRentItemsData()){
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize(),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(0.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        items(items = rentItemList){ foodList ->
            RentRow(foodList,navController){ selectedFoodItem ->
               // Log.d("SelectedFoodItem",selectedFoodItem.name)
                navController?.navigate(route = HomeMainAppScreens.ProductDetailScreen.name+"/"+selectedFoodItem.id)
            }
        }
    }
}
//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RentRow(rentData: RentItemsData, navController: NavController?, onItemClick:(RentItemsData) -> Unit ={}){
    var painter: Painter? =null
    var rating by remember { mutableFloatStateOf(1f) } //default rating will be 1
    var expanded by remember {
        mutableStateOf(false)
    }

    when(rentData.image){
        "bike" ->{
            painter = painterResource(id = R.drawable.bike)
        }
        "drill" ->{
            painter = painterResource(id = R.drawable.drill)
        }
        "projector" ->{
            painter = painterResource(id = R.drawable.projector)
        }
        "carpetcleaner" ->{
            painter = painterResource(id = R.drawable.small_carpet_cleaner)
        }
        "trimmer" ->{
            painter = painterResource(id = R.drawable.hedge_trimmer_cordless)
        }
        "wetvacumecleaner" ->{
            painter = painterResource(id = R.drawable.wet_cleaner)
        }
        "extendableLadder" ->{
            painter = painterResource(id = R.drawable.extendable_ladder)
        }
        "sewingMachine" ->{
            painter = painterResource(id = R.drawable.sewing_machine)
        }
        "dehumidifier" ->{
            painter = painterResource(id = R.drawable.dehumidifier)
        }
        "staplegun" ->{
            painter = painterResource(id = R.drawable.staple_gun)
        }else->{
        painter = painterResource(id = R.drawable.bike)
    }
    }
    Card(modifier = Modifier
        .padding(4.dp)
        .fillMaxSize(),
        onClick = {
            onItemClick(rentData)
        },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)) {
        Surface(modifier = Modifier
            .wrapContentSize()
            .align(Alignment.CenterHorizontally),
            color = Color.White,
        ) {
            Column {
                Image(modifier = Modifier
                    .height(200.dp),
                    painter = painter!!,
                    contentDescription = "image description",
                    contentScale = ContentScale.FillBounds)

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp),
                    horizontalArrangement  =  Arrangement.SpaceBetween){
                    Column(modifier = Modifier
                        .fillMaxHeight()
                        .align(Alignment.CenterVertically)) {
                        Text(modifier = Modifier,
                            text = rentData.name,
                            maxLines = 1,
                            style = TextStyle(
                                fontSize = 12.sp,
                                lineHeight = 20.sp,
                                fontFamily = FontFamily(Font(R.font.lexend_deca_bold)),
                                fontWeight = FontWeight.Bold,
                                color = colorResource(R.color.black),
                            )
                        )
                    }

                }
                Row(modifier = Modifier
                    .wrapContentSize()) {
                    Image(
                        painter = painterResource(R.drawable.contract),
                        contentDescription = "Circle Image",
                        //contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 10.dp, top = 0.dp)
                            .background(colorResource(R.color.white))
                            //.align(Alignment.Start)
                            .size(13.dp)
                            .clip(CircleShape) // clip to the circle shap
                    )
                    Text(modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 5.dp, top = 0.dp),
                        text = rentData.firmName,
                        style = TextStyle(
                            fontSize = 11.sp,
                            lineHeight = 20.sp,
                            fontFamily = FontFamily(Font(R.font.lexend_deca_medium)),
                            fontWeight = FontWeight(500),
                            color = colorResource(R.color.black),
                        )
                    )
                }
                Row {
                    Image(
                        painter = painterResource(R.drawable.location),
                        contentDescription = "Circle Image",
                        //contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxHeight()
                            .padding(start = 10.dp, top = 0.dp)
                            .background(colorResource(R.color.white))
                            //.align(Alignment.Start)
                            .size(13.dp)
                            .clip(CircleShape) // clip to the circle shap
                    )
                    Text(modifier = Modifier
                        // .align(Alignment.Start)
                        .padding(start = 5.dp, top = 0.dp),
                        text = rentData.location,
                        style = TextStyle(
                            fontSize = 11.sp,
                            lineHeight = 20.sp,
                            fontFamily = FontFamily(Font(R.font.lexend_deca_medium)),
                            fontWeight = FontWeight(500),
                            color = colorResource(R.color.black),
                        )
                    )
                }
                Text(modifier = Modifier
                    .align(Alignment.Start)
                    .padding(start = 10.dp, top = 5.dp, bottom = 10.dp),
                    text = rentData.description,
                    maxLines = 1,
                    style = TextStyle(
                        fontSize = 11.sp,
                        lineHeight = 20.sp,
                        fontFamily = FontFamily(Font(R.font.lexend_deca_medium)),
                        fontWeight = FontWeight(500),
                        color = colorResource(R.color.black),
                    )
                )
            }
        }
    }
}