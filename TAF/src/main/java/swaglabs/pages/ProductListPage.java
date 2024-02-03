package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductListPage {
    private  final WebDriver driver;

    private final By sauceLabsOnesieButtonBy = By.xpath("//*[contains(text(),'Sauce Labs Onesie')]");
    public ProductListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnOensieProduct(){
        WebElement sauceLabsOnesieButton = driver.findElement(sauceLabsOnesieButtonBy);
        sauceLabsOnesieButton.click();
    }
}
