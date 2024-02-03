package swaglabs;

import common.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonSwagLabsTestSteps extends DriverFactory {
    public void loginWithUserAndPassword(String user, String password) {
        // when user types valid auth data
        WebElement userNameInput = driver.findElement(By.name("user-name"));
        userNameInput.sendKeys(user);

        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys(password);

        WebElement loginButton = driver.findElement(By.name("login-button"));
        loginButton.click();
    }

}
