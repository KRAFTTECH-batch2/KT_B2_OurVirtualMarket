package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


    WebDriver driver;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
