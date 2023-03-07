package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage{

    public void billingDetails_loc (String details){          // --> First Name, Last Name.....
         String locs = "//label[text()='"+details+"']";
    }

    @FindBy(xpath = "//input[@id=\"input-email\"]")
    public WebElement email_loc;

    @FindBy(xpath = "//input[@id=\"input-password\"]")
    public WebElement password_loc;

    @FindBy(xpath = "//input[@id=\"button-login\"]")
    public WebElement loginBtn_loc;

    @FindBy(xpath = "//input[@value=\"Continue\"]")
    public WebElement continue_loc;

    @FindBy(xpath = "//input[@name=\"payment_address\"][@value=\"existing\"]")
    public WebElement radio_1_1Btn_loc;  //--> this locator used for isSelected

    @FindBy(xpath = "//input[@name=\"payment_address\"][@value=\"new\"]")
    public WebElement radio_1_2Btn_loc;

    @FindBy(xpath = "//input[@name=\"shipping_address\"][@value=\"existing\"]")
    public WebElement radioBtn_2_1_loc;

    @FindBy(xpath = "//input[@id=\"button-shipping-address\"]")
    public WebElement shippingContinueBtn_loc;

    public void newAdressElements_loc(int info){ //firstName = 1, LastName = 2 ....
        String newAdresslocs = "(//div[@id=\"payment-new\"]//div[@class=\"col-sm-10\"])["+info+"]";}

    @FindBy(xpath = "//input[@name=\"shipping_method\"]")
    public  WebElement flatRadioBtn_loc;

    @FindBy(xpath = "//textarea[@name=\"comment\"]")
    public WebElement addComments_loc;

    @FindBy(xpath = "(//textarea[@name=\"comment\"])[2]")
    public WebElement AddComments2_loc;

    @FindBy(xpath = "//input[@name=\"payment_method\"]")
    public WebElement cashOndelivery_loc;  //--> this locator used for isSelected

    @FindBy(xpath = "//input[@id=\"button-shipping-method\"]")
    public WebElement continueBtnStep4_loc;

    @FindBy(xpath = "//input[@name=\"agree\"]")
    public WebElement termsRadio_loc;

    @FindBy(xpath = "//input[@id=\"button-payment-method\"]")
    public WebElement step5Continue_loc;

    @FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]")
    public WebElement termsAlertMessage_loc;

    @FindBy(xpath = "//div[@class=\"panel-collapse collapse in\"]//textarea")
    public WebElement step5_textarea_loc;

    @FindBy(xpath = "//td[text()='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer']")
    public WebElement productName_loc;  //--> this locator used for assertion

    @FindBy(xpath = "//input[@value=\"Confirm Order\"]")
    public WebElement confirmBtn_loc;

    @FindBy(xpath = "//h1[text()='Your order has been placed!']")
    public WebElement succesMessage_loc; //--> this locator used for assertion

    @FindBy(xpath = "//a[text()='Continue']")
    public WebElement succesPageContinue_loc;

    @FindBy(xpath = "//a[@class=\"sticky-myaccount\"]")
    public WebElement myAccount_loc;

    @FindBy(xpath = "//i[@class=\"fa fa-history\"]")
    public WebElement history_loc;

    @FindBy(xpath = "(//i[@class=\"fa fa-eye\"])[1]")
    public WebElement viewBtn_loc;

    @FindBy(xpath = "//td[text()='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer']")
    public WebElement viewProductName_loc; //--> this locator used for assertion






}
