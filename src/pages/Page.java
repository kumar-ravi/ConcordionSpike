package pages;


import support.TestWebDriver;

public abstract class Page {

    public TestWebDriver testWebDriver;

    protected Page(TestWebDriver driver) {
        this.testWebDriver = driver;
    }

}
