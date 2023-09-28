package test.java;

import main.java.pageEvents.CheckoutEvents;
import main.java.pageEvents.PaymentPageEvents;
import org.testng.annotations.Test;

public class CheckoutPageTest extends BaseTest {
    @Test
    public void MethodSuccessful() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.ValidScenario();
        //driver.switchTo().frame("@id='seerbit-frame'");
        CheckoutEvents checkoutEvents = new CheckoutEvents();
        checkoutEvents.Successful();
    }
    @Test
    public void MethodUnSuccessful() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.ValidScenario();
        //driver.switchTo().frame("@id='seerbit-frame'");
        CheckoutEvents checkoutEvents = new CheckoutEvents();
        checkoutEvents.Unuccessful();
    }
}
