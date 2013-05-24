package pages;


import org.openqa.selenium.WebDriver;


public class HomePage {
    protected WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public HomePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void open() {
        webDriver.get("http://goindigo.in");
    }

    public void close() {
        webDriver.close();

    }
}
