package com.ok.londonloot.models

import java.time.Instant
import java.util.Date

//@Entity(tableName = "food_tbl")
data class RentItemsData(
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

fun getRentItemsData():List<RentItemsData>{
    return listOf(
        RentItemsData(1,"wetvacumecleaner","Wet & Dry Vacuum Cleaner","Mark","Waltham Abbey",4f,"£180 per day for Wet & Dry Vacuum Cleaner"),
        RentItemsData(2,"extendableLadder","Extendable Ladder","Jenny","Harrow",5f,"£50 per day for Extendable Ladder"),
        RentItemsData(3,"sewingMachine","Sewing Machine","Tongdak (Korean Chicken)","East Ham",4f," £250 per day for Sewing Machine for"),
        RentItemsData(4,"dehumidifier","Dehumidifier","Marry","Northolt, London",3f,"£200 per day for Dehumidifier"),
        RentItemsData(5,"staplegun","Staple Gun","Wayve","London",5f,"£80 per day for Staple Gun"),
        RentItemsData(6,"bike","Powerful e-Bike","Haris","East Ham",3f,"£17 per day Powerful e-Bike"),
        RentItemsData(7,"drill","Drill (cordless)","Max","East London",5f,"£7 per day forNew Drill (cordless)"),
        RentItemsData(8,"projector","Projector","John","Shoreditch",5f,"£20 per day for Projector"),
        RentItemsData(9,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"£50 per day for Carpet Cleaner for"),
        RentItemsData(10,"trimmer","Hedge Trimmer (cordless)","Martha","Upton",3f,"£80 per day for Hedge Trimmer (cordless)"),

    )
}

fun getRentItemsDetails(rentItemId:Int):RentItemsData{
    val rentItemData:RentItemsData
    when(rentItemId){
        1 ->{
            rentItemData = RentItemsData(1,"bike","Powerful e-Bike","Haris","East Ham",3f,"Gears\n" +
                    "\n" +
                    "7 gears\n" +
                    "\n" +
                    "Motor\n" +
                    "\n" +
                    "Shimano Steps E6100\n" +
                    "\n" +
                    "Brakes\n" +
                    "\n" +
                    "Hand + back pedal brakes\n" +
                    "\n" +
                    "Supported functions\n" +
                    "\n" +
                    "Eco, normal, high\n" +
                    "\n" +
                    "Drive\n" +
                    "\n" +
                    "Chain transmission\n" +
                    "\n" +
                    "Hub\n" +
                    "\n" +
                    "Shimano N7 Coaster brake")
        }
        2 ->{
            rentItemData =  RentItemsData(3,"projector","Projector","John","Shoreditch",5f,"Projector for £20 per day")

        }
        3 ->{
            rentItemData =  RentItemsData(4,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"Carpet Cleaner for £50 per day")


        }
        4 ->{
            rentItemData =   RentItemsData(4,"carpetcleaner","Carpet Cleaner","Troy","Richmond",5f,"Carpet Cleaner for £50 per day")

        }
        5 ->{
            rentItemData =    RentItemsData(5,"trimmer","Hedge Trimmer (cordless)","Martha","Upton",3f,"Hedge Trimmer (cordless) for £80 per day")

        }
        6 ->{
            rentItemData =     RentItemsData(6,"wetvacumecleaner","Wet & Dry Vacuum Cleaner","Mark","Waltham Abbey",4f,"Wet & Dry Vacuum Cleaner for £180 per day")

        }
        7 ->{
            rentItemData =    RentItemsData(7,"extendableLadder","Extendable Ladder","Jenny","Harrow",5f,"Extendable Ladder for £50 per day")

        }
        8 ->{
            rentItemData =   RentItemsData(8,"sewingMachine","Sewing Machine","Tongdak (Korean Chicken)","East Ham",4f,"Sewing Machine for £200 per day")

        }
        9 ->{
            rentItemData =  RentItemsData(9,"Dehumidifier","Dehumidifier","Marry","Northolt, London",3f,"Dehumidifier for £200 per day")

        }
        10 ->{
            rentItemData =  RentItemsData(10,"StapleGun","Staple Gun","Wayve","London",5f,"Staple Gun for £80 per day")

        }
        else ->{
            rentItemData =   RentItemsData(10,"StapleGun","Staple Gun","Wayve","London",5f,"Staple Gun for £80 per day")
        }

    }
    return rentItemData
}

