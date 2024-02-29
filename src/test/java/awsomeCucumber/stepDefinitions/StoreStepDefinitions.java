package awsomeCucumber.stepDefinitions;

import awsomeCucumber.apis.CartApi;
import awsomeCucumber.constants.EndPoint;
import awsomeCucumber.context.TestContext;
import awsomeCucumber.domainObjects.Product;
import awsomeCucumber.pages.PageFactoryManager;
import awsomeCucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.annotations.Test;


public class StoreStepDefinitions {


    private final StorePage storePage;
    private TestContext context;
    public StoreStepDefinitions(TestContext context){
        this.context=context;
        storePage = PageFactoryManager.getStorePage(context.driver);
    }
    @Given("I'm on the Store/Product Page")
    public void iMOnTheStorePage() {

        storePage.load(EndPoint.STORE.url);
    }

    @When("I add a {product} to the cart")
    public void iAddAToTheCart(Product product) throws InterruptedException {

        storePage.addToCart(product.getName());
    }
    @And("I have a product in the cart")
    public void iHaveAProductInTheCart() throws InterruptedException {

        String productName = "Blue Shoes";
       // storePage.addToCart(productName);
        CartApi cartApi = new CartApi(context.cookies.getCookies());
        cartApi.addToCart(1215,1); // Product ID for Blue Shoes is 1215
        context.cookies.setCookies(cartApi.getCookies());
        context.cookies.injectCookiesToBrowser(context.driver);
    }
}
