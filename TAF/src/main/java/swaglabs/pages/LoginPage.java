package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final By usernameInputBy = By.name("user-name");
    private final By passwordInputBy = By.name("password");
    private final By loginButtonBy = By.name("login-buttin");
    private WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        webDriver = driver;
    }


    public void fillUserNameInput(String userName) {
        WebElement userNameInput = webDriver.findElement(usernameInputBy);
        userNameInput.sendKeys(userName);
    }

    public void fillPasswordInput(String password) {
        WebElement userpassword = webDriver.findElement(passwordInputBy);
        userpassword.sendKeys(password);
    }

    public void clickLoginButton() {
        WebElement loginButton = webDriver.findElement(loginButtonBy);
        loginButton.click();
    }
}
