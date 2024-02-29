package awsomeCucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;

public class DriverFactory {


   // private static final driver;

    public static WebDriver initializeDriver(String browser ){
        WebDriver driver;

        switch (browser.toLowerCase()){
//            case "chrome":
//                driver = new ChromeDriver();
//                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();

        return driver;
    }
}
