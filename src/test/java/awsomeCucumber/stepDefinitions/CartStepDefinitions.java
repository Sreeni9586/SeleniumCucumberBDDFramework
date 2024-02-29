package awsomeCucumber.stepDefinitions;

import awsomeCucumber.context.TestContext;
import awsomeCucumber.domainObjects.Product;
import awsomeCucumber.pages.CartPage;
import awsomeCucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartStepDefinitions {

    private final CartPage cartPage;
    public CartStepDefinitions(TestContext context){

        cartPage = PageFactoryManager.getCartPage(context.driver);

    }
    @Then("I should see {int} {product} in the cart")
    public void iSeeInTheCart(int expectedProductQuantity, Product product) throws InterruptedException {

        Assert.assertEquals(product.getName(),cartPage.getProductName());
        Assert.assertEquals(expectedProductQuantity,cartPage.getProductQuantity());
    }


}
