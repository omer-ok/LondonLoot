package com.ok.londonloot.models

import java.time.Instant
import java.util.Date

//@Entity(tableName = "food_tbl")
data class GigData(
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

fun getGigData():List<GigData>{
    return listOf(
        GigData(1,"deliver","Deliver a package across Brixton","Haris","East Ham",3f,"Deliver 6x10 box to Brixton has to be done at 14 june at 10 am Max"),
        GigData(2,"Queue","Queue for concert tickets","Bach to Baby","London",5f,"This role would also suit a local parent looking for a few extra hours of work as concert stewarding can be easily combined with school/nursery drop off given concert prep starts from 9.30am.\n" +
                "\n" +
                "Duties\n" +
                "• Being the public face of Bach to Baby, representing the brand.\n" +
                "• Looking after the needs of the audience, artists and venues at a concert.\n" +
                "• Preparation of venue prior to concert, including putting up posters and sound/lighting check.\n" +
                "• Assisting concert attendees, which includes ticketing, giving directions and serving light refreshments.\n" +
                "• After concert: assisting in returning the venue to the state in which we found it.\n" +
                "\n" +
                "Requirements\n" +
                "Essential\n" +
                "• Reliable\n" +
                "• Friendly and sensitive to the needs of audience members\n" +
                "• Experience of dealing with the public and excellent customer service.\n" +
                "• Good interpersonal skills to develop and maintain effective working relationships\n" +
                "• Adaptable and ready to embrace the entrepreneurial spirit of the company"),
        GigData(3,"furniture","Help move furniture in Shoreditch","John","Shoreditch",5f,"Appliance removal, Bulky waste collection, Furniture removal, Waste clearance, Hazardous waste removal, Man and van rubbish clearance, Rubbis"),
        GigData(4,"teacher","English Tutor Required","Troy","Richmond",5f,"Salary: £150 - 251 per day\n" +
                "Reference: EnglishTeachHerts2\n" +
                "Teaching Personnel are seeking to recruit an English Teacher for a secondary school in Hertfordshire!\n" +
                "\n" +
                "Teacher of English – Full Time, Permanent\n" +
                "Salary: MPS/UPS/ Suitable for ECT's inc. London fringe area\n" +
                "Start Date: September 2025"),
        GigData(5,"nanny","Nanny Needed for kids","Martha","Upton",3f,"A wonderful family based in London Bridge is looking for a Full-time Nanny to assist them in looking after their two school-aged children. They are looking for someone proactive, flexible, and confident who can carry out all childcare duties.\n" +
                "\n" +
                "• Working hours: Monday to Wednesday from 8:00 am to 6:00 pm, Thursday - Friday from 12:00pm to 5pm, approximately 40 hours per week.\n" +
                "\n" +
                "School holidays will be Monday to Friday from 8:00 am to 6:00 pm, approximately 50 hours per week\n" +
                "\n" +
                "• Salary: £18 - £20 gross per hour\n" +
                "\n" +
                "• Duties include:\n" +
                "\n" +
                "• Bathing and ensuring proper hygiene for the children\n" +
                "\n" +
                "• Prioritising the safety, well-being, and overall development of the children\n" +
                "\n" +
                "• Engaging in interactive play, educational activities, and outdoor outings such as park visits\n" +
                "\n" +
                "• Encouraging early literacy through regular reading\n" +
                "\n" +
                "• Assisting with homework and supporting the children’s educational progress\n" +
                "\n" +
                "• Establishing and maintaining consistent daily routines to provide structure and stability\n" +
                "\n" +
                "• Keeping the children’s bedrooms and play areas clean, organised, and tidy\n" +
                "\n" +
                "• Preparing and serving nutritious meals and snacks tailored to the family\n" +
                "\n" +
                "They are looking for someone who can start immediately."),
        GigData(6,"steward","Event Steward In London Area ","Achilleus Security","Waltham Abbey",4f,"Exciting opportunities to join Achilleus Security in London as a Part-Time Casual Event Steward or Football Steward. Apply today and be part of our team!",),
        GigData(7,"traffic","Traffic Marshall","Frontline Construction Recruitment","Harrow",5f,"TRAFFIC MARSHALL REQUIRED IN HARROW\n" +
                "\n" +
                "MUST HAVE SMSTS OR SSSTS CERTIFICATE\n" +
                "\n" +
                "Requirements:\n" +
                "• Valid CSCS Card\n" +
                "• Traffic Marshall Card\n" +
                "• Valid SMSTS or SSSTS\n" +
                "• Full PPE\n" +
                "\n" +
                "Applicants must have previous Traffic Marshall experience and be able to provide references from previous employers.\n" +
                "\n" +
                "The potential candidate for this Traffic Marshall position must have can do attitude, be punctual and reliable."),
        GigData(8,"chicken","Kitchen Staff","Tongdak (Korean Chicken)","East Ham",4f,"1. Cut, trim, and handle chicken.. Mix the marinated chicken and drain.. . 2. Kitchen porter. . You will be expected to work in the kitchen and maintain cleanliness at all times in terms of hygiene. You will assist the chef and do the finishing touches before the food is served. You will need to be flexible and help the chef to ensure that orders go out smoothly.. . **Requirements of Kitchen Porter**. • Previous experience in Kitchen environment. • Flexible with tasks and working hours. • Team player. • Organisation skills\n" +
                "\n" +
                "Experience: Required\n" +
                "Employment: Part-time\n" +
                "Schedule: Date adjustable /10:30am-4pm/ 4pm-10:30pm\n" +
                "Starting time: Immediate start!\n" +
                "\n" +
                "About Tongdak (Korean Chicken):\n" +
                "\n" +
                "We are a Korean style chicken shop with 3 branches and are continuing to expand."),
        GigData(9,"warehouse","Warehouse & Forklift Operative","Gi Group","Northolt, London",3f,"Full Time\n" +
                "\n" +
                "Permanent\n" +
                "\n" +
                "Warehouse and Forklift Operative\n" +
                "\n" +
                "Working Hours: Monday to Friday, 7:00 AM to 4:30 PM OR 8:00 AM to 5:30 PM, with occasional Saturday shifts (42.5 hours per week).\n" +
                "Salary: £13 - £13.50 per hour\n" +
                "Location: Northolt, London\n" +
                "\n" +
                "Key Responsibilities:\n" +
                "• Heavy lifting (doors up to 50kg), including loading and unloading customer vehicles.\n" +
                "• Operating Reach and Counterbalance trucks for tasks such as:\n" +
                "• Picking doors for deliveries.\n" +
                "• Putting away pallets.\n" +
                "• Unloading containers.\n" +
                "• Serving customers.\n" +
                "\n" +
                "Requirements:\n" +
                "• Valid Reach and Counterbalance truck licenses.\n" +
                "• Ability to perform physical tasks involving heavy lifting.\n" +
                "• Strong attention to detail and punctuality.\n" +
                "• Ideally located locally or within a short commute to Northolt.\n" +
                "\n" +
                "If you meet the requirements and are looking for a rewarding role, apply today!"),

        GigData(10,"driver","Driver - Vehicle Safety Operator","Wayve","London",5f,"Key responsibilities:\n" +
                "• Be a part of our world-class, diverse operations team to test our vehicles all over the UK.\n" +
                "• Monitor our artificial intelligence and respond to all hazards to guarantee safe testing at all times.\n" +
                "• Evaluate our artificial intelligence during tests, and provide expert feedback to our research teams and engineers.\n" +
                "• Provide real-world driving examples to train our artificial intelligence before you test on public roads.\n" +
                "• Support our safety and engineer teams by maintaining our high safety standards, and reporting safety and vehicle issues."),

    )
}

fun getGigDetails(gigId:Int):GigData{
    val gigData:GigData
    when(gigId){
        1 ->{
            gigData = GigData(1,"deliver","Deliver a package across Brixton","Haris","East Ham",3f,"Deliver 6x10 box to Brixton has to be done at 14 june at 10 am Max")
        }
        2 ->{
            gigData = GigData(2,"Queue","Queue for concert tickets","Bach to Baby","London",5f,"This role would also suit a local parent looking for a few extra hours of work as concert stewarding can be easily combined with school/nursery drop off given concert prep starts from 9.30am.\n" +
                    "\n" +
                    "Duties\n" +
                    "• Being the public face of Bach to Baby, representing the brand.\n" +
                    "• Looking after the needs of the audience, artists and venues at a concert.\n" +
                    "• Preparation of venue prior to concert, including putting up posters and sound/lighting check.\n" +
                    "• Assisting concert attendees, which includes ticketing, giving directions and serving light refreshments.\n" +
                    "• After concert: assisting in returning the venue to the state in which we found it.\n" +
                    "\n" +
                    "Requirements\n" +
                    "Essential\n" +
                    "• Reliable\n" +
                    "• Friendly and sensitive to the needs of audience members\n" +
                    "• Experience of dealing with the public and excellent customer service.\n" +
                    "• Good interpersonal skills to develop and maintain effective working relationships\n" +
                    "• Adaptable and ready to embrace the entrepreneurial spirit of the company")
        }
        3 ->{
            gigData =  GigData(3,"furniture","Help move furniture in Shoreditch","John","Shoreditch",5f,"Appliance removal, Bulky waste collection, Furniture removal, Waste clearance, Hazardous waste removal, Man and van rubbish clearance, Rubbis")

        }
        4 ->{
            gigData = GigData(4,"teacher","English Tutor Required","Troy","Richmond",5f,"Salary: £150 - 251 per day\n" +
                    "Reference: EnglishTeachHerts2\n" +
                    "Teaching Personnel are seeking to recruit an English Teacher for a secondary school in Hertfordshire!\n" +
                    "\n" +
                    "Teacher of English – Full Time, Permanent\n" +
                    "Salary: MPS/UPS/ Suitable for ECT's inc. London fringe area\n" +
                    "Start Date: September 2025")
        }
        5 ->{
            gigData = GigData(5,"nanny","Nanny Needed for kids","Martha","Upton",3f,"A wonderful family based in London Bridge is looking for a Full-time Nanny to assist them in looking after their two school-aged children. They are looking for someone proactive, flexible, and confident who can carry out all childcare duties.\n" +
                    "\n" +
                    "• Working hours: Monday to Wednesday from 8:00 am to 6:00 pm, Thursday - Friday from 12:00pm to 5pm, approximately 40 hours per week.\n" +
                    "\n" +
                    "School holidays will be Monday to Friday from 8:00 am to 6:00 pm, approximately 50 hours per week\n" +
                    "\n" +
                    "• Salary: £18 - £20 gross per hour\n" +
                    "\n" +
                    "• Duties include:\n" +
                    "\n" +
                    "• Bathing and ensuring proper hygiene for the children\n" +
                    "\n" +
                    "• Prioritising the safety, well-being, and overall development of the children\n" +
                    "\n" +
                    "• Engaging in interactive play, educational activities, and outdoor outings such as park visits\n" +
                    "\n" +
                    "• Encouraging early literacy through regular reading\n" +
                    "\n" +
                    "• Assisting with homework and supporting the children’s educational progress\n" +
                    "\n" +
                    "• Establishing and maintaining consistent daily routines to provide structure and stability\n" +
                    "\n" +
                    "• Keeping the children’s bedrooms and play areas clean, organised, and tidy\n" +
                    "\n" +
                    "• Preparing and serving nutritious meals and snacks tailored to the family\n" +
                    "\n" +
                    "They are looking for someone who can start immediately.")}
        6 ->{
            gigData = GigData(6,"steward","Event Steward In London Area ","Achilleus Security","Waltham Abbey",4f,"Exciting opportunities to join Achilleus Security in London as a Part-Time Casual Event Steward or Football Steward. Apply today and be part of our team!",)
        }
        7 ->{
            gigData =  GigData(7,"traffic","Traffic Marshall","Frontline Construction Recruitment","Harrow",5f,"TRAFFIC MARSHALL REQUIRED IN HARROW\n" +
                    "\n" +
                    "MUST HAVE SMSTS OR SSSTS CERTIFICATE\n" +
                    "\n" +
                    "Requirements:\n" +
                    "• Valid CSCS Card\n" +
                    "• Traffic Marshall Card\n" +
                    "• Valid SMSTS or SSSTS\n" +
                    "• Full PPE\n" +
                    "\n" +
                    "Applicants must have previous Traffic Marshall experience and be able to provide references from previous employers.\n" +
                    "\n" +
                    "The potential candidate for this Traffic Marshall position must have can do attitude, be punctual and reliable.")
        }
        8 ->{
            gigData = GigData(8,"chicken","Kitchen Staff","Tongdak (Korean Chicken)","East Ham",4f,"1. Cut, trim, and handle chicken.. Mix the marinated chicken and drain.. . 2. Kitchen porter. . You will be expected to work in the kitchen and maintain cleanliness at all times in terms of hygiene. You will assist the chef and do the finishing touches before the food is served. You will need to be flexible and help the chef to ensure that orders go out smoothly.. . **Requirements of Kitchen Porter**. • Previous experience in Kitchen environment. • Flexible with tasks and working hours. • Team player. • Organisation skills\n" +
                    "\n" +
                    "Experience: Required\n" +
                    "Employment: Part-time\n" +
                    "Schedule: Date adjustable /10:30am-4pm/ 4pm-10:30pm\n" +
                    "Starting time: Immediate start!\n" +
                    "\n" +
                    "About Tongdak (Korean Chicken):\n" +
                    "\n" +
                    "We are a Korean style chicken shop with 3 branches and are continuing to expand.")
        }
        9 ->{
            gigData = GigData(9,"warehouse","Warehouse & Forklift Operative","Gi Group","Northolt, London",3f,"Full Time\n" +
                    "\n" +
                    "Permanent\n" +
                    "\n" +
                    "Warehouse and Forklift Operative\n" +
                    "\n" +
                    "Working Hours: Monday to Friday, 7:00 AM to 4:30 PM OR 8:00 AM to 5:30 PM, with occasional Saturday shifts (42.5 hours per week).\n" +
                    "Salary: £13 - £13.50 per hour\n" +
                    "Location: Northolt, London\n" +
                    "\n" +
                    "Key Responsibilities:\n" +
                    "• Heavy lifting (doors up to 50kg), including loading and unloading customer vehicles.\n" +
                    "• Operating Reach and Counterbalance trucks for tasks such as:\n" +
                    "• Picking doors for deliveries.\n" +
                    "• Putting away pallets.\n" +
                    "• Unloading containers.\n" +
                    "• Serving customers.\n" +
                    "\n" +
                    "Requirements:\n" +
                    "• Valid Reach and Counterbalance truck licenses.\n" +
                    "• Ability to perform physical tasks involving heavy lifting.\n" +
                    "• Strong attention to detail and punctuality.\n" +
                    "• Ideally located locally or within a short commute to Northolt.\n" +
                    "\n" +
                    "If you meet the requirements and are looking for a rewarding role, apply today!")}
        10 ->{
            gigData = GigData(10,"driver","Driver - Vehicle Safety Operator","Wayve","London",5f,"Key responsibilities:\n" +
                    "• Be a part of our world-class, diverse operations team to test our vehicles all over the UK.\n" +
                    "• Monitor our artificial intelligence and respond to all hazards to guarantee safe testing at all times.\n" +
                    "• Evaluate our artificial intelligence during tests, and provide expert feedback to our research teams and engineers.\n" +
                    "• Provide real-world driving examples to train our artificial intelligence before you test on public roads.\n" +
                    "• Support our safety and engineer teams by maintaining our high safety standards, and reporting safety and vehicle issues.")
        }
        else ->{
            gigData = GigData(10,"driver","Driver - Vehicle Safety Operator","Wayve","London",5f,"Key responsibilities:\n" +
                    "• Be a part of our world-class, diverse operations team to test our vehicles all over the UK.\n" +
                    "• Monitor our artificial intelligence and respond to all hazards to guarantee safe testing at all times.\n" +
                    "• Evaluate our artificial intelligence during tests, and provide expert feedback to our research teams and engineers.\n" +
                    "• Provide real-world driving examples to train our artificial intelligence before you test on public roads.\n" +
                    "• Support our safety and engineer teams by maintaining our high safety standards, and reporting safety and vehicle issues.")
        }

    }
    return gigData
}

