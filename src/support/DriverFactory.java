package support;


import com.gargoylesoftware.htmlunit.BrowserVersion;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class DriverFactory {

    private String driverType;

    public WebDriver loadDriver(String browser) throws InterruptedException {

        return loadDriver(true, browser);
    }

    public String driverType() throws InterruptedException {
        return driverType.trim();
    }

    private WebDriver loadDriver(boolean enableJavascript, String browser) throws InterruptedException {

        switch (browser) {
            case "firefox":
                driverType = System.getProperty("web.driver", "Firefox");
                return createFirefoxDriver(enableJavascript);

            case "HTMLUnit":
                return new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER_8);

            default:
                driverType = System.getProperty("web.driver", "Firefox");
                return createFirefoxDriver(enableJavascript);
        }
    }

    private WebDriver createFirefoxDriver(boolean enableJavascript) {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setPreference("signed.applets.codebase_principal_support", true);
        profile.setPreference("javascript.enabled", enableJavascript);
        return new FirefoxDriver(profile);
    }
}
