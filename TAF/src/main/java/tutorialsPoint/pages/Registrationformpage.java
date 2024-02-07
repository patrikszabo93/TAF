package tutorialsPoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registrationformpage {
    private final WebDriver driver;
    private final WebDriverWait wait;

    private final By fillnameBy = By.name("name");
    private final By emailBy = By.name("email");


    public Registrationformpage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void fillname(String userName) {
        WebElement fillnamewith = driver.findElement(fillnameBy);
        fillnamewith.click();
        fillnamewith.sendKeys(userName);
    }

    public void email(String email) {
        WebElement emailwith = driver.findElement(emailBy);
        emailwith.sendKeys(email);
    }

}