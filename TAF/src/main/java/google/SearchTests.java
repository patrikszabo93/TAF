package google;

import common.DriverFactory;
import google.pages.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends DriverFactory {
    @Test
    public void searchForWeather() {
        driver.get("https://www.google.com");
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(driver, wait);
        googleSearchPage.clickAcceptCookieButton();
        googleSearchPage.addTextToSearchBox("weather");
        googleSearchPage.clickSearchButton();
        Assert.assertTrue(driver.getPageSource().contains("Találatok"));
    }
}
