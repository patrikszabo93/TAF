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

       boolean isWebpageContainsThisString = driver.getPageSource().contains("Sauce Labs Onesie");
       Assert.assertTrue(isWebpageContainsThisString);


       WebElement BacktoProductButton = driver.findElement(By.name("back-to-products"));
       BacktoProductButton.click();

       WebElement TestAllTheThingsButton = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
       TestAllTheThingsButton.click();

       boolean isWebpageContainsThisString2 = driver.getPageSource().contains("Test.allTheThings() T-Shirt (Red)");
       Assert.assertTrue(isWebpageContainsThisString2);
    }


}