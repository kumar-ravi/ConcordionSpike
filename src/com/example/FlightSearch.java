package com.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;

import java.util.List;

public class FlightSearch {

    public String flightNumber(String flightNumber) {
        return String.format("Flight Number " + flightNumber);


    }

    public String SearchForFlights(String flightOrigin, String flightDestination) {

        WebDriver driver = new FirefoxDriver();
        driver.get("http://goindigo.in");

        WebElement oneWay = driver.findElement(By.id("oneWayRadio"));
        oneWay.click();

        Alert oneWayAlert = driver.switchTo().alert();
        System.out.print(oneWayAlert.getText());
        oneWayAlert.accept();

        Select originAirport = new Select(driver.findElement(By.id("from1Select")));

        originAirport.selectByVisibleText(flightOrigin);

        Select destinationAirport = new Select(driver.findElement(By.id("to1Select")));


        destinationAirport.selectByVisibleText(flightDestination);


        WebElement flightSearchButton = driver.findElement(By.xpath("//div[@class='buttonAlign']/a/img"));
        flightSearchButton.click();

        Alert sameDayFlightAlert = driver.switchTo().alert();
        System.out.print(sameDayFlightAlert.getText());
        sameDayFlightAlert.accept();

        String orig = String.format(flightOrigin);

        return String.format("Flight Origin Airport: " + flightOrigin);


    }
}
