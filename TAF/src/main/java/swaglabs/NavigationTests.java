package swaglabs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class NavigationTests extends CommonSwagLabsTestSteps {

   @Test
   public void navigateToProductDetailsTest() {
      //Előfeltétel
      // oldal betöltése
      driver.get("https://www.saucedemo.com");

      // 1. Bejelentkezés standard_user username-el és secret_sauce jelszóval
      loginWithUserAndPassword("standard_user", "secret_sauce");

      // 2. Sauce Labs Onesie termék címére rákattintás

      // WebElement SauceLabsOnesieButton = driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div"));
      // WebElement SauceLabsOnesieButton = driver.findElement(By.xpath("//*[contains(text(),'Sauce Labs Onesie')]"));
      List<WebElement> itemTitles = driver.findElements(By.className("inventory_item_name"));
      itemTitles.get(4).click();
      // SauceLabsOnesieButton.click();

      //Elvárt működés
      // A termékrészletező oldalra navigáció sikeres, a termék neve "Sauce Labs Onesie"
      boolean isWebpageContainsThisString = driver.getPageSource().contains("Sauce Labs Onesie");
      Assert.assertTrue(isWebpageContainsThisString);
      // version1
      WebElement productTitle = driver.findElement(By.className("inventory_details_name"));
      Assert.assertEquals(productTitle.getText(), "Sauce Labs Onesie");
      // version2
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(actualUrl, "https://www.saucedemo.com/inventory-item.html?id=2");


      WebElement BacktoProductButton = driver.findElement(By.name("back-to-products"));
      BacktoProductButton.click();

      WebElement TestAllTheThingsButton = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
      TestAllTheThingsButton.click();

      boolean isWebpageContainsThisString2 = driver.getPageSource().contains("Test.allTheThings() T-Shirt (Red)");
      Assert.assertTrue(isWebpageContainsThisString2);
   }


}
