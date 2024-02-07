package google.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By searchInputBy = By.cssSelector("textarea[title='Keresés']");
    private final By searchInputByV2 = By.xpath("//textarea[contains(@title,'Keres')]");
    private final By searchButtonBy = By.cssSelector("input[value='Google-keresés']");
    private final By acceptCookieButtonBy = By.id("L2AGLb");

    public GoogleSearchPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clickAcceptCookieButton() {
        WebElement acceptCookieButton = driver.findElement(acceptCookieButtonBy);
        acceptCookieButton.click();
    }

    public void addTextToSearchBox(String searchText) {
        WebElement searchInput = driver.findElement(searchInputByV2);
        searchInput.sendKeys(searchText);
        //searchInput.sendKeys(Keys.RETURN);  // ENTER leütése a szöveg beírása után
    }

    public void clickSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButtonBy)); //explicit várakozás mindaddig, amíg a login-button elem meg nem jelenik. Max 30.mp-ig.
        WebElement searchButton = driver.findElement(searchButtonBy);
        searchButton.click();
    }
}
