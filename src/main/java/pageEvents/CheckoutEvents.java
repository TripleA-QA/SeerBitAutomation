package main.java.pageEvents;

import main.java.pageObjects.CheckoutPage;
import main.java.utils.Elementfetch;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class CheckoutEvents {

    public void Successful() {
        Elementfetch elementfetch = new Elementfetch();
        //elementfetch.getWebElement("CSS", CheckoutPage.DisplayCard).click();

        boolean b = elementfetch.getWebElement("CSS", CheckoutPage.CardNumber).isDisplayed();
        System.out.println(b);
        elementfetch.getWebElement("CSS", CheckoutPage.CardNumber).sendKeys("5123 4500 0000 0008");
        elementfetch.getWebElement("CSS", CheckoutPage.Expiry).sendKeys("1224");
        elementfetch.getWebElement("ID", CheckoutPage.cvv).sendKeys("100");
        elementfetch.getWebElement("CSS", CheckoutPage.submit).click();

        boolean id = elementfetch.getWebElement("ID", CheckoutPage.Authorize).isDisplayed();
        System.out.println(id);

        elementfetch.getWebElement("ID", CheckoutPage.Authorize).click();
        elementfetch.getWebElement("CSS", CheckoutPage.Authorize).click();

        Select select = new Select(elementfetch.getWebElement("CSS", CheckoutPage.AutResult));
        select.selectByValue("Authentication Successful");


        Assert.assertEquals("Your transaction was successful", CheckoutPage.SuccessfulResponse);
    }


    public void Unuccessful() {
        Elementfetch elementfetch = new Elementfetch();
        //elementfetch.getWebElement("CSS", CheckoutPage.DisplayCard).click();

        boolean b = elementfetch.getWebElement("CSS", CheckoutPage.CardNumber).isDisplayed();
        System.out.println(b);
        elementfetch.getWebElement("CSS", CheckoutPage.CardNumber).sendKeys("5123 4500 0000 0008");
        elementfetch.getWebElement("CSS", CheckoutPage.Expiry).sendKeys("1224");
        elementfetch.getWebElement("ID", CheckoutPage.cvv).sendKeys("100");
        elementfetch.getWebElement("CSS", CheckoutPage.submit).click();

        boolean id = elementfetch.getWebElement("ID", CheckoutPage.Authorize).isDisplayed();
        System.out.println(id);

        elementfetch.getWebElement("ID", CheckoutPage.Authorize).click();


        Select select = new Select(elementfetch.getWebElement("CSS", CheckoutPage.AutResult));
        select.selectByVisibleText("Authentication Successful");


        Assert.assertEquals("Transaction Failed", CheckoutPage.SuccessfulResponse);
    }
}