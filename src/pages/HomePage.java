package pages;

import support.TestWebDriver;

public class HomePage extends Page {

    private String flightOrigin;
    private String flightDestination;

    public HomePage(TestWebDriver driver, String flightOrigin, String flightDestination) {
        super(driver);
        this.flightOrigin = flightOrigin;
        this.flightDestination = flightDestination;
    }

    public void setItineraryType() {
        testWebDriver.getElementByXpath("//input[@id='oneWayRadio']").click();
        testWebDriver.acceptAlert();
    }

    public void setOriginAirport() {
        testWebDriver.selectByVisibleText(testWebDriver.getElementById("from1Select"), flightOrigin);
    }

    public void setDestinationAirport() {
        testWebDriver.selectByVisibleText(testWebDriver.getElementById("to1Select"), flightDestination);
    }

    public String findFlights() {
        testWebDriver.getElementByXpath("//div[@class='buttonAlign']/a/img").click();
        testWebDriver.acceptAlert();
        testWebDriver.waitForElementToAppear(testWebDriver.getElementByXpath("//div[@id='PageHeader']/h1"));
        return testWebDriver.getElementByXpath("//div[@id='PageHeader']/h1").getText();
    }

}
