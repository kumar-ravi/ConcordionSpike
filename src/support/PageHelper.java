package support;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageHelper {

    public static WebElement getElementByXPath(String xPath) {
        return TestRunner.driver.findElement(By.xpath(xPath));
    }

    public static Select getElementById(String id) {
        return new Select(TestRunner.driver.findElement(By.id(id)));
    }

    public static void acceptAlert() {
        Alert oneWayAlert = TestRunner.driver.switchTo().alert();
        oneWayAlert.accept();
    }

}
