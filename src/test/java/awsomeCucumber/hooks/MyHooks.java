package awsomeCucumber.hooks;

import awsomeCucumber.context.TestContext;
import awsomeCucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;


public class MyHooks {

    private WebDriver driver;
    private final TestContext context;

    public MyHooks (TestContext context){
        this.context = context;

    }

    @Before

    public void before(Scenario scenario) {
        context.scenarioName = scenario.getName();
        System.out.println("Dependency Injection: SCENARIO NAME:"+context.scenarioName);
        System.out.println("Before Thread ID: "+Thread.currentThread().getId() +" SCENARIO NAME: "+scenario.getName());
        String browser = System.getProperty("browser","chrome");
        driver = DriverFactory.initializeDriver(browser);
        context.driver = driver;
    }

    @After

    public void after(Scenario scenario) {
        System.out.println("Before Thread ID: "+Thread.currentThread().getId() +" SCENARIO NAME: "+scenario.getName());
        driver.quit();
    }
}
