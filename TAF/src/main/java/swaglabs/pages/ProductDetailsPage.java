package swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    WebDriver driver;
    By productTitleBy = By.className("inventory_details_name");


    public ProductDetailsPage (WebDriver driver){
        this.driver = driver;
    }




}
