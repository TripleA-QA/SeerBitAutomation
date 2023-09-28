package main.java.pageEvents;

import main.java.pageObjects.PaymentPage;
import main.java.utils.Elementfetch;
import org.testng.Assert;

public class PaymentPageEvents {

    public void EmptyFname() {
        Elementfetch elementfetch = new Elementfetch();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).click();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).sendKeys("///");
        elementfetch.getWebElement("ID", PaymentPage.LastName).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.email).sendKeys("Test@qa.team");
        elementfetch.getWebElement("ID", PaymentPage.PhoneNumber).sendKeys("08051583385");
        elementfetch.getWebElement("ID", PaymentPage.Amount).sendKeys("100");
        //elementfetch.getWebElement("ID", PaymentPage.ContinueButton).click();
        String txt = elementfetch.getWebElement("CSS", PaymentPage.FirstnameTest).getText();
        Assert.assertEquals("Please enter first name", txt);


    }

    public void EmptyLname() {
        Elementfetch elementfetch = new Elementfetch();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).click();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).sendKeys("///");
        elementfetch.getWebElement("ID", PaymentPage.LastName).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.email).sendKeys("Test@qa.team");
        elementfetch.getWebElement("ID", PaymentPage.PhoneNumber).sendKeys("08051583385");
        elementfetch.getWebElement("ID", PaymentPage.Amount).sendKeys("100");
        //elementfetch.getWebElement("ID", PaymentPage.ContinueButton).click();
        String txt = elementfetch.getWebElement("CSS", PaymentPage.FirstnameTest).getText();
        Assert.assertEquals("Please enter first name", txt);


    }

    public void InvalidEmail() {
        Elementfetch elementfetch = new Elementfetch();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.LastName).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.email).sendKeys("Test@");
        elementfetch.getWebElement("ID", PaymentPage.PhoneNumber).sendKeys("08051583385");
        elementfetch.getWebElement("ID", PaymentPage.Amount).sendKeys("100");
        //elementfetch.getWebElement("ID", PaymentPage.ContinueButton).click();
        String txt = elementfetch.getWebElement("CSS", PaymentPage.FirstnameTest).getText();
        Assert.assertEquals("Please enter a valid email address", txt);


    }

    public void InvalidAmount() {
        Elementfetch elementfetch = new Elementfetch();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).sendKeys("Hope");
        elementfetch.getWebElement("ID", PaymentPage.LastName).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.email).sendKeys("Test@qa.team");
        elementfetch.getWebElement("ID", PaymentPage.PhoneNumber).sendKeys("08051583385");
        elementfetch.getWebElement("ID", PaymentPage.Amount).sendKeys("100-");
        //elementfetch.getWebElement("ID", PaymentPage.ContinueButton).click();

        String txt = elementfetch.getWebElement("CSS", PaymentPage.FirstnameTest).getText();
        Assert.assertEquals("Inavlid Amount", txt);


    }

    public void ValidScenario() {
        Elementfetch elementfetch = new Elementfetch();
        elementfetch.getWebElement("ID", PaymentPage.Firstname).sendKeys("Hope");
        elementfetch.getWebElement("ID", PaymentPage.LastName).sendKeys("Lola");
        elementfetch.getWebElement("ID", PaymentPage.email).sendKeys("Test@qa.team");
        elementfetch.getWebElement("ID", PaymentPage.PhoneNumber).sendKeys("08051583385");
        elementfetch.getWebElement("ID", PaymentPage.Amount).sendKeys("100");
        elementfetch.getWebElement("CSS", PaymentPage.ContinueButton).click();

        //String txt = elementfetch.getWebElement("CSS", PaymentPage.NextPage).getText();
        //Assert.assertEquals("Debit/credit card detaiils", txt);
    }

}
