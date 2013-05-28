package support;

import static java.lang.System.getProperty;

public class TestCaseHelper {

    public static final String DEFAULT_BROWSER = "firefox";
    public static final String DEFAULT_BASE_URL = "http://indigo.com/";

    protected static boolean isSeleniumStarted = false;

    protected static TestWebDriver testWebDriver;
    protected static DriverFactory driverFactory = new DriverFactory();
    private String baseUrlGlobal;

    public void setup() throws Exception {
        String browser = getProperty("browser", DEFAULT_BROWSER);
        baseUrlGlobal = getProperty("baseurl", DEFAULT_BASE_URL);

        if (!isSeleniumStarted) {
            loadDriver(browser);
            addTearDownShutDownHook();
            isSeleniumStarted = true;
        }
    }

    public void tearDownSuite() {
        testWebDriver.quitDriver();
    }

    protected void addTearDownShutDownHook() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                if (testWebDriver != null) {
                    tearDownSuite();
                }
            }
        });
    }

    protected void loadDriver(String browser) throws InterruptedException {
        testWebDriver = new TestWebDriver(driverFactory.loadDriver(browser));
    }
}
