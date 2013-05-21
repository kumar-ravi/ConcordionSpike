package com.example;

public class FlightSearch {

    public String flightNumber(String flightNumber) {
        return String.format("Flight Number " + flightNumber);


    }

    public String flightOrigin(String flightOrigin) {
        String orig = String.format(flightOrigin);
        System.out.println(orig);
        return String.format("Flight Origin Airport: " + flightOrigin);


    }
}
