package com.ars

import java.sql.Time
import java.time.LocalTime

data class AirlineData(val flightname:String,val flightNo:String, val fromCity:String, val fromtime:LocalTime,val toCity:String,val totime:LocalTime, val eprice:Int, val bprice:Int,val pprice:Int){
    companion object{
        val indigo = arrayListOf<AirlineData>()
        val airindia = arrayListOf<AirlineData>()
    }
}
object Flights{
    fun input(){
        val if1 = AirlineData("Indigo","6E 2716","New Delhi",LocalTime.of(2,0),"Mumbai", LocalTime.of(4,20),5357,7530,20340)
        val if2 = AirlineData("Indigo","6E 6047","Mumbai", LocalTime.of(11,15),"New Delhi", LocalTime.of(13,30),5357,7530,20340)
        val if3 = AirlineData("Indigo","6E 2337","New Delhi", LocalTime.of(5,0),"Hyderabad", LocalTime.of(7,15),5306,7530,20340)
        val if4 = AirlineData("Indigo","6E 6212","Hyderabad", LocalTime.of(15,30),"New Delhi", LocalTime.of(17,45),5306,7530,20340)
        AirlineData.indigo.add(if1)
        AirlineData.indigo.add(if2)
        AirlineData.indigo.add(if3)
        AirlineData.indigo.add(if4)

        val af1 = AirlineData("Air India","AI 665","New Delhi", LocalTime.of(8,0),"Mumbai",LocalTime.of(10,20),5387,8650,21230)
        val af2 = AirlineData("Air India","AI 441","New Delhi", LocalTime.of(17,15),"Mumbai",LocalTime.of(19,35),5387,8650,21230)
        val af3 = AirlineData("Air India","AI 560","New Delhi", LocalTime.of(6,55),"Hyderabad",LocalTime.of(9,20),5377,8650,21230)
        val af4 = AirlineData("Air India","AI 839","New Delhi", LocalTime.of(21,30),"Hyderabad",LocalTime.of(23,45),5377,8650,21230)
        AirlineData.airindia.add(af1)
        AirlineData.airindia.add(af2)
        AirlineData.airindia.add(af3)
        AirlineData.airindia.add(af4)
    }
}