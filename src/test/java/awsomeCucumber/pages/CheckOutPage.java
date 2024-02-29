package awsomeCucumber.pages;

import awsomeCucumber.domainObjects.BillingDetails;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends BasePage {

    @FindBy(id = "billing_first_name")
    private WebElement billingFirstNameFld;

    @FindBy(id = "billing_last_name")
    private WebElement billingLastNameFld;

    @FindBy(id = "billing_address_1")
    private WebElement billingAddressOneFld;
    @FindBy(id = "billing_city")
    private WebElement billingCityFld;

    @FindBy(id = "billing_state")
    private WebElement billingStateDropDown;

    @FindBy(id = "billing_postcode")
    private WebElement billingZipFld;
    @FindBy(id = "billing_email")
    private WebElement billingEmailFld;

    @FindBy(xpath = "//button[@id='place_order']")
    private WebElement placeOrderBtn;

    @FindBy(xpath = "//div[@class='woocommerce-order']/p[contains(@class,'woocommerce')]")
    private WebElement noticeMessagefield;

    public CheckOutPage(WebDriver driver) {

        super(driver);
    }

    public CheckOutPage enterBillingFirstName(String billingFirstName){
        wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
        billingFirstNameFld.sendKeys(billingFirstName);
        return this;

    }
    public CheckOutPage enterBillingLastName(String billingLastName){
        wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
        billingLastNameFld.sendKeys(billingLastName);
        return this;

    }
    public CheckOutPage enterBillingAddressOne(String billingAddressOne){
        wait.until(ExpectedConditions.visibilityOf(billingAddressOneFld));
        billingAddressOneFld.sendKeys(billingAddressOne);
        return this;

    }
    public CheckOutPage enterBillingCity(String billingCity){
        wait.until(ExpectedConditions.visibilityOf(billingCityFld));
        billingCityFld.sendKeys(billingCity);
        return this;

    }

    public CheckOutPage enterBillingState(String billingState){
        wait.until(ExpectedConditions.visibilityOf(billingStateDropDown));
        Select select = new Select(billingStateDropDown);
        select.selectByVisibleText(billingState);
        return this;

    }

    public CheckOutPage enterBillingPostCode(String billingPostCode){
        wait.until(ExpectedConditions.visibilityOf(billingZipFld));
        billingZipFld.sendKeys(billingPostCode);
        return this;

    }
    public CheckOutPage enterBillingEmail(String billingEmail){
        wait.until(ExpectedConditions.visibilityOf(billingEmailFld));
        billingEmailFld.sendKeys(billingEmail);
        return this;

    }

    public CheckOutPage setBillingDetails(BillingDetails billingDetails){

        return enterBillingFirstName(billingDetails.getBillingfirstName()).
                enterBillingLastName(billingDetails.getBillinglastName()).
                enterBillingAddressOne(billingDetails.getBillingaddressLine1()).
                enterBillingCity(billingDetails.getBillingcity()).
                enterBillingState(billingDetails.getBillingstate()).
                enterBillingPostCode(billingDetails.getBillingzip()).
                enterBillingEmail(billingDetails.getBillingemail());

    }

    public CheckOutPage placeOrder(){
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn));
        placeOrderBtn.click();

        return this;
    }

    public String getNoticeMessage() throws InterruptedException {
        Thread.sleep(10000);
        wait.until(ExpectedConditions.visibilityOf(noticeMessagefield));
        return noticeMessagefield.getText();

    }

}
