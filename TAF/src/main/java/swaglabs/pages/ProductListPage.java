package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ProductListPage {
    private final WebDriver driver;
    private final By oensieProductTitleBy = By.xpath("//*[contains(text(),'Sauce Labs Onesie')]");
    private final By tshirtCartButtonBy = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private final By cartButtonBy = By.className("shopping_cart_link");
    private final By pageTitleBy = By.className("title");
    private final By clickOnBackPackBy = By.name("add-to-cart-sauce-labs-backpack");
    private final By clickOnBikeLightBy = By.name("add-to-cart-sauce-labs-bike-light");
    private final By removeBackPackBy = By.cssSelector("button[data-test='remove-sauce-labs-backpack']");

    public ProductListPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnOensieProduct() {
        WebElement oensieProductTitle = driver.findElement(oensieProductTitleBy);
        oensieProductTitle.click();
    }

    public void clickTShirtCartButton() {
        WebElement tShirtCartButton = driver.findElement(tshirtCartButtonBy);
        tShirtCartButton.click();
    }

    public void clickOnCartButton() {
        WebElement cartButton = driver.findElement(cartButtonBy);
        cartButton.click();
    }
    public void clickOnBackPack() {

        WebElement backpackCartButton = driver.findElement(clickOnBackPackBy);
        backpackCartButton.click();
    }
    public void clickOnLightCart() {
        WebElement bikelightCartButton = driver.findElement(clickOnBikeLightBy);
        bikelightCartButton.click();
    }
    public void removeBackpack() {


        WebElement removeBackbackButton = driver.findElement(removeBackPackBy);
        removeBackbackButton.click();
    }

    public WebElement getPageTitle() {
        WebElement productsTitle = driver.findElement(pageTitleBy);
        return productsTitle;
    }

}
