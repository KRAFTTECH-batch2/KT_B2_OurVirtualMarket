package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//button[@class='popup-close']")
    public static WebElement closePopup_loc;

    @FindBy(xpath = "//li[@class='log logout']//a[contains(text(),'Logout')]")
    public WebElement logoutButton_loc;



    public static void closePopup_mtd(){

        closePopup_loc.click();
    }









}
