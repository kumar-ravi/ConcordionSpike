package pages;

import support.PageHelper;

public class HomePage {

    private String flightOrigin;
    private String flightDestination;

    public HomePage(String flightOrigin, String flightDestination) {
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
    }

    public void setItineraryType() {
        PageHelper.getElementByXPath("//input[@id='oneWayRadio']").click();
        PageHelper.acceptAlert();
    }

    public void setOriginAirport() {
        PageHelper.getElementById("from1Select").selectByVisibleText(flightOrigin);
    }

    public void setDestinationAirport() {
        PageHelper.getElementById("to1Select").selectByVisibleText(flightDestination);
    }

    public String findFlights() {
        PageHelper.getElementByXPath("//div[@class='buttonAlign']/a/img").click();
        PageHelper.acceptAlert();
        return PageHelper.getElementByXPath("//div[@id='PageHeader']/h1").getText();
    }

}
