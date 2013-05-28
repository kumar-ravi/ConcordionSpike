package support;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestWebDriver {

    private static WebDriver driver;
    private String BASE_URL;
    private String ERROR_MESSAGE_LOGIN;
    private int DEFAULT_WAIT_TIME = 30;


    public TestWebDriver(WebDriver driver)  {

        this.driver=driver;
        maximizeBrowser();
    }

    public void setBaseURL(String BASE_URL)
    {
        this.BASE_URL=BASE_URL;
        get();
    }


    public void acceptAlert() {
        Alert oneWayAlert = driver.switchTo().alert();
        oneWayAlert.accept();
    }


    public void get() {
        driver.get(BASE_URL);
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    public void quitDriver() {
        driver.quit();
    }

    public void maximizeBrowser(){
        driver.manage().window().maximize();
    }

    public void waitForElementToAppear(final WebElement element) {
        (new WebDriverWait(driver, DEFAULT_WAIT_TIME)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return (element.isDisplayed());
            }
        });
    }

    public void selectByVisibleText(WebElement element, String visibleText) {
        new Select(element).selectByVisibleText(visibleText);
    }

    public WebElement getElementById(String Id) {
        return  driver.findElement(By.id(Id));
    }

    public WebElement getElementByXpath(String Xpath) {
        return  driver.findElement(By.xpath(Xpath) );
    }

}
