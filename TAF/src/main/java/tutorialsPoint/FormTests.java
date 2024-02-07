package tutorialsPoint;

import common.DriverFactory;
import org.testng.annotations.Test;
import tutorialsPoint.pages.Registrationformpage;

public class FormTests extends DriverFactory {
    @Test
            public void fillform(){
        driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
        Registrationformpage registrationformpage = new Registrationformpage(driver,wait);
        registrationformpage.fillname("Patrik Szabo");
        registrationformpage.email("patrikszabo93@gmail.com");
    }
}
