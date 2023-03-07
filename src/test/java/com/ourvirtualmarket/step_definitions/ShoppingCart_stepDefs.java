package com.ourvirtualmarket.step_definitions;

import com.ourvirtualmarket.pages.CheckoutPage;
import com.ourvirtualmarket.pages.HomePage;
import com.ourvirtualmarket.pages.ShoppingCartPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class ShoppingCart_stepDefs {
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("The user chooses product on shopping cart page")
    public void the_user_chooses_product_on_shopping_cart_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        BrowserUtils.waitFor(1);
        shoppingCartPage.closePopup2_loc.click();
        BrowserUtils.scrollToElement(shoppingCartPage.product1_loc);
        shoppingCartPage.product1_loc.click();
        shoppingCartPage.addToCartBtn_loc.click();
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        shoppingCartPage.checkoutBtn_loc.click();
    }

    @When("The user completes address information and payment methods")
    public void the_user_completes_address_information_and_payment_methods() {

        checkoutPage.email_loc.sendKeys(ConfigurationReader.get("email"));
        checkoutPage.password_loc.sendKeys(ConfigurationReader.get("password"));
        checkoutPage.loginBtn_loc.click();

        boolean expectedRadioBtn1 = true;
        Assert.assertEquals("button in billing details is NOT selected by default"
                , expectedRadioBtn1, checkoutPage.radio_1_1Btn_loc.isSelected());
        checkoutPage.continue_loc.click();

        boolean expectedRadioBtn2 = true;
        Assert.assertEquals("button in Delivery details is NOT selected by default"
                , expectedRadioBtn2, checkoutPage.radioBtn_2_1_loc.isSelected());
        checkoutPage.shippingContinueBtn_loc.click();

        boolean expectedFlatRadio = true;
        Assert.assertEquals("button in Delivery Method is NOT selected by default"
                , expectedFlatRadio, checkoutPage.flatRadioBtn_loc.isSelected());
        checkoutPage.addComments_loc.sendKeys("This area is available for use");
        checkoutPage.continueBtnStep4_loc.click();

        boolean expectedCashRadio = true;
        Assert.assertEquals("button in Payment Method is NOT selected by default"
                , expectedCashRadio, checkoutPage.cashOndelivery_loc.isSelected());
        checkoutPage.AddComments2_loc.sendKeys("This area is available for use");
        checkoutPage.termsRadio_loc.click();
        checkoutPage.step5Continue_loc.click();
        BrowserUtils.waitFor(1);

        String expectedProductName = "Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer";
        String actualProductName = checkoutPage.productName_loc.getText();
        Assert.assertEquals("The selected product is NOT correct",
                expectedProductName, actualProductName);
        checkoutPage.confirmBtn_loc.click();


    }

    @Then("The user checks the product she or he bought")
    public void the_user_checks_the_product_she_or_he_bought() {

        String expectedSuccessfulyOrderMsg = "Your order has been placed!";
        Assert.assertEquals("The user was NOT redirected to the correct page"
                , expectedSuccessfulyOrderMsg, checkoutPage.succesMessage_loc.getText());
        checkoutPage.succesPageContinue_loc.click();

        //Since the button specified in step 13 is NOT found on the page, NO action has been taken

        shoppingCartPage.closePopup2_loc.click();
        checkoutPage.myAccount_loc.click();
        checkoutPage.history_loc.click();
        checkoutPage.viewBtn_loc.click();
        String expectedProductName = "Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer";
        Assert.assertEquals("wrong product details appear", expectedProductName
                , checkoutPage.viewProductName_loc.getText());


    }

}
