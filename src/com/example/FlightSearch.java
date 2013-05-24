package com.example;


import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import org.testng.annotations.*;

import java.util.List;

@RunWith(ConcordionRunner.class)
public class FlightSearch {

    protected WebDriver driver;

    @BeforeTest
    public void SetUp(){
        driver = new FirefoxDriver();
        System.out.println("in setup");
    }

    @AfterTest
    public void TearDown(){
        driver.quit();
    }


    @Test
    public void SearchForFlights(String flightOrigin, String flightDestination) {

        System.out.println(driver.getTitle());
        System.out.println(flightOrigin);
        System.out.println(flightDestination);

    }
}
