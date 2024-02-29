package awsomeCucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage {
    public StorePage(WebDriver driver) {

        super(driver);
    }

    public void  addToCart(String productName){

        By addToCartButton = By.xpath("//h2[text()="+"'"+ productName+"'" +"]/parent::a/parent::div//a[text()='Add to cart']");
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
        By viewCartLink = By.xpath("//h2[text()="+"'"+ productName+"'" +"]/parent::a/parent::div//a[text()='View cart']");
        wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();

    }
}