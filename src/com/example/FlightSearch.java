package com.example;

import pages.HomePage;

public class FlightSearch {

    public String searchForFlights(String flightOrigin, String flightDestination) {
        HomePage homePage = new HomePage(flightOrigin, flightDestination);
        homePage.setItineraryType();
        homePage.setOriginAirport();
        homePage.setDestinationAirport();
        return homePage.findFlights();
    }

}
