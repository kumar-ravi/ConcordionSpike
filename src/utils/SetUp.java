package utils;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.seleniumemulation.Close;
import org.testng.annotations.BeforeMethod;

public class SetUp {

//    protected static final String WEB_SERVER = System.getProperty("WEB_SERVER", "http://stackoverflow.com/");
//    protected static final String BROWSER = System.getProperty("BROWSER", "firefox");
//    protected static final boolean REMOTE_DRIVER = Boolean.valueOf(System.getProperty("REMOTE_DRIVER", "false"));
//    protected static final String SELENIUM_HOST = System.getProperty("SELENIUM_HOST", "localhost");
//    protected static final int SELENIUM_PORT = Integer.valueOf(System.getProperty("SELENIUM_PORT", "4444"));

    protected WebDriver driver;

    @Before
    public void SetUp() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://goindigo.in");
    }

    @After
    public void TearDown(){
       driver.quit();
    }

}
