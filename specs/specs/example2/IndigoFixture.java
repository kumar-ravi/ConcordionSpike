package specs.example2;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import com.example.FlightSearch;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;


/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class IndigoFixture {

    private WebDriver webDriver;

    private HomePage homePage;

    @Before
    public void setUp() {
        webDriver = new FirefoxDriver();
        homePage = PageFactory.initElements(webDriver, HomePage.class);
        homePage.open();

    }

    public void searchResults(String originAirport, String destinationAirport) {
        System.out.print("I reached");

    }

    @After
    public void tearDown() {
        homePage.close();
    }


 }
