package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {


    @FindBy(xpath = "(//img[@src=\"https://ourvirtualmarket.com/image/cache/catalog/afm/image7487326-270x270.webp\"][2])")
    public WebElement product1_loc;
    @FindBy(xpath = "(//div[@class=\"container\"]//a[@class=\"clearfix\"])[1]")
    public WebElement homePageBtn_loc;
    @FindBy(xpath = "//input[@value=\"Add to Cart\"]")
    public WebElement addToCartBtn_loc;
    @FindBy(xpath = "//div[@class=\"cart-popup-action\"]//a[text()='Checkout']")
    public WebElement checkoutBtn_loc;
    @FindBy(xpath = "//button[@class='popup-close']")
    public WebElement closePopup2_loc;


}
