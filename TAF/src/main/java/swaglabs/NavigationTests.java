package swaglabs;

import common.DriverFactory;
import org.testng.annotations.Test;

public class NavigationTests extends CommonSwagLabsTestSteps {

   @Test
    public void navigateToProductDetailsTest(){

       driver.get("https://www.saucedemo.com");

       loginWithUserAndPassword("standard_user","secret_sauce");
    }
}
