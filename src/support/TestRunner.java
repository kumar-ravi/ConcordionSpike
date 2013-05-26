package support;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRunner {

    public static WebDriver driver;

    public TestRunner() {
        driver = new FirefoxDriver();
    }

    @Before
    public void setUp() throws InterruptedException {
        driver.get("http://goindigo.in");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
