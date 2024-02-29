package awsomeCucumber.context;

import awsomeCucumber.domainObjects.BillingDetails;
import awsomeCucumber.domainObjects.Cookies;
import org.openqa.selenium.WebDriver;

public class TestContext {
    public String scenarioName;
    public WebDriver driver;
    public BillingDetails billingDetails;
    public Cookies cookies;

    public TestContext() {
        cookies = new Cookies();
        cookies.setCookies(new io.restassured.http.Cookies());
    }
}
