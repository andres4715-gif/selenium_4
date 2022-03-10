package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/java/resources/features/login.feature"
        , glue = "stepDefinition"
)
public class RunnerCucumberTestLogin extends AbstractTestNGCucumberTests {

}
