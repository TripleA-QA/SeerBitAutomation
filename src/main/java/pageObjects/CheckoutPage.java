package main.java.pageObjects;

public interface CheckoutPage {
    String CardNumber = "input[placeholder*='Card Number']";
    String DisplayCard ="p.text-black:nth-child(5)";
    String card ="test-card.text-black";

    String button ="trigger";
    //String buttonAut ="span.flex:nth-child(1)";
    //String AutResult = "listbox-option-0";
    String AutResult = ".sc-csCMJt.fvQOhc";
    String submit="#trigger";
    String Authorize = "#trigger";


    String cardNumber = "card-input";
    String Expiry = ".expiry > input:nth-child(1)";
    String cvv = "cvv";
    String frame = "seerbit-frame";
    String SuccessfulResponse = "Payment-success";
}
