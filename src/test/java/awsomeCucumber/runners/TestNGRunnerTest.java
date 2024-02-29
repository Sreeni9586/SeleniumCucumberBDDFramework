package awsomeCucumber.runners;

import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber.html"},
        glue = {"awsomeCucumber"},
        features = "src/test/resources/awsomeCucumber"
)

public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}