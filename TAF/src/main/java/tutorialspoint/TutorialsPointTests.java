package tutorialspoint;

import common.DriverFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tutorialspoint.pages.TutorialsPointPage;

public class TutorialsPointTests extends DriverFactory {

    @Test
    public void filloutFormTest(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        TutorialsPointPage tutorialsPointPage = new TutorialsPointPage(driver);
        tutorialsPointPage.fillNameInput("Zsolt");
        tutorialsPointPage.fillEmailInput("vmi@vmi.hu");
        tutorialsPointPage.clickOnFemaleRadio();
        tutorialsPointPage.fillMobileInput("0690990900");
        tutorialsPointPage.fillDateOfBirthInput("2024-01-01");
        tutorialsPointPage.fillSubjectInput("subject");
        tutorialsPointPage.clickOnSportsCheckbox();
        tutorialsPointPage.fillPictureFileUploadInput("valami.png");
        tutorialsPointPage.fillCurrentAddressInput("Budapest");
        tutorialsPointPage.selectState("Rajasthan");
        tutorialsPointPage.selectCity("Agra");
        Assert.assertTrue(tutorialsPointPage.isLoginButtonClickable());
        tutorialsPointPage.clickLoginButton();
    }
}
