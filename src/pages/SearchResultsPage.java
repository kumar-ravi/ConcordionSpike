package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created with IntelliJ IDEA.
 * User: kumarravi
 * Date: 23/05/13
 * Time: 5:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class SearchResultsPage {

    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        System.out.print(driver.getTitle());
        System.out.println("I reached on search results");
    }
}
