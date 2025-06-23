package com.ok.londonloot.models

import java.time.Instant
import java.util.Date

//@Entity(tableName = "food_tbl")
data class SellItemsData(
  //  @PrimaryKey
    //val id:UUID =UUID.randomUUID(),
    val id:Int,
    val image:String,
    val name :String,
    val firmName :String,
    val location :String,
    val rating:Float,
    val description:String,
    val updateDate : Date = Date.from(Instant.now())
)

fun getSellItemsData():List<SellItemsData>{
    return listOf(
        SellItemsData(1,"bike","Powerful e-Bike","Haris","East Ham",3f,"£170 Price"),
        SellItemsData(2,"drill","Drill (cordless)","Max","East London",5f,"£700 Price"),
        SellItemsData(3,"projector","Projector","John","Shoreditch",5f,"£20 Price"),
        SellItemsData(4,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"£50  Price"),
        SellItemsData(5,"trimmer","Hedge Trimmer (cordless)","Martha","Upton",3f,"£80 Price"),
        SellItemsData(6,"wetvacumecleaner","Wet & Dry Vacuum Cleaner","Mark","Waltham Abbey",4f,"£180 Price"),
        SellItemsData(7,"extendableLadder","Extendable Ladder","Jenny","Harrow",5f,"£50 Price"),
        SellItemsData(8,"sewingMachine","Sewing Machine","Tongdak (Korean Chicken)","East Ham",4f," £250 Price"),
        SellItemsData(9,"dehumidifier","Dehumidifier","Marry","Northolt, London",3f,"£200 Price"),
        SellItemsData(10,"staplegun","Staple Gun","Wayve","London",5f,"£80 Price"),

    )
}

fun getSellItemsDetails(rentItemId:Int):SellItemsData{
    val sellItemData:SellItemsData
    when(rentItemId){
        1 ->{
            sellItemData =  SellItemsData(1,"bike","Powerful e-Bike","Haris","East Ham",3f,"£17  Price")

        }
        2 ->{
            sellItemData =  SellItemsData(3,"projector","Projector","John","Shoreditch",5f,"£200 Price")

        }
        3 ->{
            sellItemData =  SellItemsData(4,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"£400 Price")


        }
        4 ->{
            sellItemData =   SellItemsData(4,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"£300 Price")

        }
        5 ->{
            sellItemData =    SellItemsData(5,"trimmer","Hedge Trimmer (cordless)","Martha","Upton",3f,"£900 Price")

        }
        6 ->{
            sellItemData =     SellItemsData(6,"wetvacumecleaner","Wet & Dry Vacuum Cleaner","Mark","Waltham Abbey",4f,"£800 Price")

        }
        7 ->{
            sellItemData =    SellItemsData(7,"extendableLadder","Extendable Ladder","Jenny","Harrow",5f,"£700 Price")

        }
        8 ->{
            sellItemData =   SellItemsData(8,"sewingMachine","Sewing Machine","Tongdak (Korean Chicken)","East Ham",4f,"£600 Price")

        }
        9 ->{
            sellItemData =  SellItemsData(9,"Dehumidifier","Dehumidifier","Marry","Northolt, London",3f,"£500 Price")

        }
        10 ->{
            sellItemData =  SellItemsData(10,"StapleGun","Staple Gun","Wayve","London",5f,"£400 Price")

        }
        else ->{
            sellItemData =   SellItemsData(10,"StapleGun","Staple Gun","Wayve","London",5f,"3200 Price")
        }

    }
    return sellItemData
}

