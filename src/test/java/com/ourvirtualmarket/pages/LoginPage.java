package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='email']")
    public WebElement email_loc;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password_loc;

    @FindBy(css = "#send2")
    public WebElement loginButton_loc;


    public void loginUser(String email, String password) {

        loginOrRegister("Login");
        email_loc.sendKeys(email);
        password_loc.sendKeys(password);
        loginButton_loc.click();

    }

    public void loginUser() {

        loginOrRegister("Login");
        email_loc.sendKeys(ConfigurationReader.get("email"));
        password_loc.sendKeys(ConfigurationReader.get("password"));
        loginButton_loc.click();

    }

}
