package awsomeCucumber.stepDefinitions;

import awsomeCucumber.constants.EndPoint;
import awsomeCucumber.context.TestContext;
import awsomeCucumber.domainObjects.BillingDetails;
import awsomeCucumber.pages.CartPage;
import awsomeCucumber.pages.CheckOutPage;
import awsomeCucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckOutStepDefinitions {


    private final CheckOutPage checkOutPage;
    private final TestContext context;
    public CheckOutStepDefinitions(TestContext context){
        this.context = context;
        checkOutPage = PageFactoryManager.getCheckOutPage(context.driver);

    }



    @And("I Place an order")
    public void iPlaceAnOrder() {
        checkOutPage.placeOrder();
    }

    @Then("the order should be placed successfully")
    public void theOrderShouldBePlacedSuccessfully() throws InterruptedException {
        String actualNoticeMessage =  checkOutPage.getNoticeMessage();
        Assert.assertEquals("Thank you. Your order has been received.",actualNoticeMessage);
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        context.billingDetails = billingDetails;
        checkOutPage.setBillingDetails(context.billingDetails);
    }

    @And("I am on the checkout Page")
    public void iAmOnTheCheckoutPage() {
        //cartPage.checkout();
        checkOutPage.load(EndPoint.CHECKOUT.url);
    }
}
