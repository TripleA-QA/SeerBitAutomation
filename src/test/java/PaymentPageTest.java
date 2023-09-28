package test.java;

import main.java.pageEvents.PaymentPageEvents;
import org.testng.annotations.Test;

public class PaymentPageTest extends BaseTest {
    @Test
    public void MethodFirstName() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.EmptyFname();
    }

    @Test
    public void MethodLastName() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.EmptyLname();
    }

    @Test
    public void MethodEmail() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.InvalidEmail();
    }

    @Test
    public void MethodAmount() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.InvalidAmount();

    }
    @Test
    public void MethodValidScenario() {
        driver.switchTo().frame("seerbit-frame");
        PaymentPageEvents paymentPageEvents = new PaymentPageEvents();
        paymentPageEvents.ValidScenario();

    }

}
