package com.ars

import java.time.LocalDate
import java.util.Scanner

class Booking(){
    var sc = Scanner(System.`in`)
    var tripType:Int = 1
    var depcity:Int = 1
    var descity:Int = 4
    var trvlrs:Int = 1
    var citylist = mutableListOf<String>("New Delhi","Mumbai","Hyderabad","Delhi")
    var trclass = listOf<String>("Economy","Business","First")
    var classnum :Int = 0
    fun tripDeets() {
        println("Type of trips:\n 1 - One Way\n 2 - Round Trip\n")
        print("Enter your choice: ")
        this.tripType = sc.nextInt()
        println("Choose the Departure City (From):\n 1 - New Delhi(DEL)\n 2 - Mumbai(BOM)\n 3 - Hyderabad(HYD)\n 4 - Bengaluru(BLR)\n")
        print("Departure City: ")
        this.depcity = sc.nextInt()
        println("Choose the Destination City (From):\n 1 - New Delhi(DEL)\n 2 - Mumbai(BOM)\n 3 - Hyderabad(HYD)\n 4 - Bengaluru(BLR)\n")
        print("Destination City: ")
        this.descity = sc.nextInt()
        if(this.depcity==this.descity){
            throw SameAirportException("From & To airports cannot be the same")
        }
        println("Enter the Departure Date:\n")
        print("Year(yyyy): ")
        var depyear = sc.nextInt()
        print("Month(MM): ")
        var depmonth = sc.nextInt()
        print("Day of the month(dd): ")
        var depday = sc.nextInt()
        var depdate = LocalDate.of(depyear,depmonth,depday)
        if(tripType==2){
            println("Enter the Return Date:\n")
            print("Year(yyyy): ")
            var retyear = sc.nextInt()
            print("Month(MM): ")
            var retmonth = sc.nextInt()
            print("Day of the month(dd): ")
            var retday = sc.nextInt()
            var retdate = LocalDate.of(depyear,depmonth,depday)
        }
        print("\nPlease enter the number of travellers: ")
        this.trvlrs = sc.nextInt()
        println("\nChoose Travel Class:")
        for(i in trclass.indices){
            println("${i+1} - ${trclass[i]}")
        }
        print("\nEnter your choice: ")
        this.classnum = sc.nextInt()
        println()
    }
    fun flightDisplay(tripType:Int,depCity:Int,desCity:Int){
        println("Airline  Flight No.  Dep. City  Take-Off  Des. City  Landing  Price")
        for(inf in AirlineData.indigo){
            if(this.citylist[depCity-1]==inf.fromCity){
                if(this.citylist[desCity-1]==inf.toCity){
                    println("${inf.flightname}    ${inf.flightNo}    ${inf.fromCity}  ${inf.fromtime}      ${inf.toCity}      ${inf.totime}      ${inf.eprice}")
                }
            }
        }

    }
}