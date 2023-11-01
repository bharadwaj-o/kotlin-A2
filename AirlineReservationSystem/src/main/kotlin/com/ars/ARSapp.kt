package com.ars

fun main(){
    var booking = Booking()
    booking.tripDeets()
    Flights.input()
    booking.flightDisplay(booking.tripType,booking.depcity,booking.descity)
}