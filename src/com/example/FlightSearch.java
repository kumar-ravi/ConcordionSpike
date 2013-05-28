package com.example;

import pages.HomePage;
import support.TestCaseHelper;
import support.TestWebDriver;

public class FlightSearch extends TestCaseHelper{

    public String searchForFlights(TestWebDriver driver, String flightOrigin, String flightDestination) {

        testWebDriver.setBaseURL("http://goindigo.in");
        HomePage homePage = new HomePage(testWebDriver, flightOrigin, flightDestination);
        homePage.setItineraryType();
        homePage.setOriginAirport();
        homePage.setDestinationAirport();
        return homePage.findFlights();
    }

}
