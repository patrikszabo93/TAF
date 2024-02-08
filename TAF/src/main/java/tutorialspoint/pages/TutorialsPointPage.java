package tutorialspoint.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class TutorialsPointPage {
    private final WebDriver driver;
    private final By nameInputBy = By.id("name");
    private final By emailInputBy = By.id("email");
    private final By radioButtonsBy = By.cssSelector("input[type='radio']");
    private final By radioButtonsByv2 = By.className("form-check-input");
    private final By mobileInputBy = By.id("mobile");
    private final By dateOfBirthBy = By.id("dob");
    private final By subjectInputBy = By.id("subjects");
    private final By checkboxesInputBy = By.cssSelector("input[type='checkbox']");
    private final By picturesInputBy = By.id("picture"); // probléma, hogy több ilyen ID van az oldalon
    private final By pictureUploadInputBy = By.cssSelector("input[id='picture']");
    private final By pictureUploadInputByV2 = By.xpath("//input[@id='picture']");  //bárhol az oldalon input típusú element, aminek az id-ja picture
    private final By currentAddressInputBy = By.xpath("//textarea[@id='picture']");  //bárhol az oldalon input típusú element, aminek az id-ja picture
    private final By selectStateBy = By.id("state");
    private final By selectCityBy = By.id("city");
    private final By loginButtonBy = By.cssSelector("input[value='Login']");

    public TutorialsPointPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillNameInput(String text) {
        WebElement nameInput = driver.findElement(nameInputBy);
        nameInput.sendKeys(text);
    }

    public void fillEmailInput(String text) {
        WebElement emailInput = driver.findElement(emailInputBy);
        emailInput.sendKeys(text);
    }

    public void clickOnFemaleRadio() {
        List<WebElement> radioButtons = driver.findElements(radioButtonsBy);
        WebElement femaleRadio = radioButtons.get(1);  //2. radio button az oldalon
        femaleRadio.click();
        //ua: driver.findElements(radioButtonsBy).get(1).click();
//        List<WebElement> radioButtonsv2 = driver.findElements(radioButtonsByv2);
//        WebElement femaleRadiov2 = radioButtonsv2.get(1);  //2. radio button az oldalon
//        femaleRadiov2.click();
    }

    public void fillMobileInput(String text) {
        WebElement mobileInput = driver.findElement(mobileInputBy);
        mobileInput.sendKeys(text);
    }

    public void fillDateOfBirthInput(String text) {
        WebElement dateOfBirthInput = driver.findElement(dateOfBirthBy);
        dateOfBirthInput.sendKeys(text);
    }

    public void fillSubjectInput(String text) {
        WebElement subjectInput = driver.findElement(subjectInputBy);
        subjectInput.sendKeys(text);
    }

    public void clickOnSportsCheckbox() {
        List<WebElement> checkboxes = driver.findElements(checkboxesInputBy);
        WebElement sportsCheckbox = checkboxes.get(0);  //1. radio button az oldalon
        sportsCheckbox.click();
    }

    public void fillPictureFileUploadInput(String filename) {
        String fileWithPath = new File(filename).getAbsolutePath();
        WebElement pictureInput = driver.findElement(pictureUploadInputByV2);
        pictureInput.sendKeys(fileWithPath);
    }

    public void fillCurrentAddressInput(String text) {
        WebElement subjectInput = driver.findElement(currentAddressInputBy);
        subjectInput.sendKeys(text);
    }

    public void selectState(String option) {
        WebElement selectWebelement = driver.findElement(selectStateBy);
        Select select = new Select(selectWebelement);
        select.selectByVisibleText(option);
    }
    public void selectCity(String option) {
        WebElement selectWebelement = driver.findElement(selectCityBy);
        Select select = new Select(selectWebelement);
        select.selectByVisibleText(option);
        //select.selectByIndex(4);
        //select.selectByValue("Rajasthan");
    }

    public void clickLoginButton(){
        WebElement loginButton = driver.findElement(loginButtonBy);
        loginButton.click();
    }
    public boolean isLoginButtonClickable(){
        WebElement loginButton = driver.findElement(loginButtonBy);
        return loginButton.isDisplayed()&& loginButton.isEnabled();
    }

}
