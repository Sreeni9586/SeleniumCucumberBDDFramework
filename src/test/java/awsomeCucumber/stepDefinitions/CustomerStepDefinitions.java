package awsomeCucumber.stepDefinitions;

import awsomeCucumber.constants.MyConstants;
import awsomeCucumber.context.TestContext;
import awsomeCucumber.domainObjects.BillingDetails;
import awsomeCucumber.pages.CheckOutPage;
import awsomeCucumber.pages.PageFactoryManager;
import awsomeCucumber.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinitions {
    private final TestContext context;
    private final StorePage storePage;
    private final CheckOutPage checkOutPage;
    public CustomerStepDefinitions(TestContext context){
        this.context = context;
        storePage = PageFactoryManager.getStorePage(context.driver);
        checkOutPage = PageFactoryManager.getCheckOutPage(context.driver);


    }

    @Then("I provide billing details")
    public void iProvideBillingDetails() {

        checkOutPage.setBillingDetails(context.billingDetails);

    }
    @Given("I am a guest customer")
    public void iAmAGuestCustomer() {
        storePage.load(MyConstants.STORE);
    }

}
