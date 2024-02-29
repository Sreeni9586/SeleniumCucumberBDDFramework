package awsomeCucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage {
    @FindBy(xpath = "//table[contains(@class,'woocommerce-cart-form')]//td[@class='product-name']/a")
    private WebElement productNameField;
    @FindBy(xpath = "//table[contains(@class,'woocommerce-cart-form')]//td[@class='product-quantity']//input")
    private WebElement productQuantityField;

    @FindBy(xpath = "//a[contains(@class,'checkout')]")
    private WebElement proceedToCheckoutBtn;


    public CartPage(WebDriver driver) {

        super(driver);
    }

    public String getProductName() {
        return wait.until(ExpectedConditions.visibilityOf(productNameField)).getText();
    }

    public int getProductQuantity() {
        return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQuantityField)).getAttribute("value"));
    }

    public void checkout() {
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtn)).click();
    }
}
