package swaglabs;

import common.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigationTests extends CommonSwagLabsTestSteps {

   @Test
    public void navigateToProductDetailsTest(){

       driver.get("https://www.saucedemo.com");

       loginWithUserAndPassword("standard_user","secret_sauce");

       WebElement SauceLabsOnesieButton = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
       SauceLabsOnesieButton.click();

     //  Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=2");

       boolean isWebpageContainsBadge = driver.getPageSource().contains("Sauce Labs Onesie");
       Assert.assertTrue(isWebpageContainsBadge);
    }
}
